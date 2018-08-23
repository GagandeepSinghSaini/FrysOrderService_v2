package com.frys.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frys.model.DelivProperties;
import com.frys.model.J1Order;
import com.frys.model.J1OrderStatus;
import com.frys.model.J1PaymentMethod;
import com.frys.model.J1ShipAddress;
import com.frys.model.OrderInfo;
import com.frys.model.SpringConfiguration;
import com.frys.service.J1OrderService;
import com.frys.service.J1OrderStatusService;
import com.frys.service.J1PaymentMethodService;
import com.frys.service.J1ShipAddressService;
import com.frys.util.DeliveryHelper;
import com.frys.util.FrysHelper;
import com.google.gson.Gson;

@RestController
public class RequestHandlerServlet {  

	@Autowired
	J1OrderService orderService;
	
	@Autowired
	J1OrderStatusService orderStatusService;
	
	@Autowired
	J1PaymentMethodService paymentMethodService;
	
	@Autowired
	J1ShipAddressService shipAddressService;
	
	@RequestMapping(path="/track/code")     //	
	public String getOrderDetailsByTrackingCode(@RequestParam(value="tracking_code", defaultValue="") String trackingCode)  {
		if(FrysHelper.isValueNull(trackingCode) && trackingCode.isEmpty()) {
			return null;
		}
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	    DelivProperties props = applicationContext.getBean(DelivProperties.class);
	    DeliveryHelper helper = new DeliveryHelper();
	    helper.setApiKey(props.getApiKey());
	    helper.setHitUrl(props.getDelivUrl());
	    return helper.getDeliveryInfo(trackingCode);
		
	}
	
	@RequestMapping(path="/track/credit")   // http://localhost:8070/order/track/credit?credit_card=S7CN7TLU
	public String getOrderDetailsByCreditCardNumber(@RequestParam(value="credit_card", defaultValue="") String creditCardNumber) {
		System.out.println("hello starting credit gagan");
		String userId = null;
		String orderId = null;
		 
		/**
		 * Need to write code for encoding / decoding the credit card number 
		 */
		String encodedCreditCardNumber = "b082281aab663a2da4dd5297d0239df756196d81e42625fab7";
		
		Map<String, List<OrderInfo>> orderDetailMap = new HashMap<String, List<OrderInfo>>();
		List<OrderInfo> orderInfoList = new ArrayList<OrderInfo>();
		Map<String, String> orderStatusMap = new HashMap<String, String>();
		List<J1OrderStatus> orderStatusList = orderStatusService.getOrderStatusDetails();
		for(J1OrderStatus orderStatus: orderStatusList) {
			orderStatusMap.put(orderStatus.getOrderStatus(), orderStatus.getDescription());
		}
		OrderInfo orderInfo = null;
		List<J1PaymentMethod> orderPaymentDetail = paymentMethodService.getDetailByCreditNumber(encodedCreditCardNumber);
		for(J1PaymentMethod orderPayment: orderPaymentDetail) {
			userId = orderPayment.getUserId();
			List<J1Order> orderList = orderService.getAllOrdersByUserId(userId);
			for(J1Order order: orderList) {
				orderInfo = new OrderInfo();
				orderId = order.getOrderId();
				orderInfoList.add(orderInfo);
				orderInfo.setOrderId(orderId);
				orderInfo.setExtOrderId(order.getExtOrderNumber());
				orderInfo.setStatus(orderStatusMap.get(order.getOrderStatus()));
				List<J1ShipAddress> orderShipDetails = shipAddressService.getShippingDetailByOrderId(orderId);
				for(J1ShipAddress orderShipAddress: orderShipDetails) {
					orderInfo.setEmailAddress(orderShipAddress.getEmail());
				}
				
			}
			System.out.println("OrderInfo: "+orderInfo);
		}
		orderDetailMap.put("orders", orderInfoList);
		Gson gsonObj = new Gson();
		String response = gsonObj.toJson(orderDetailMap);
		
		return response;
	}
	
}
