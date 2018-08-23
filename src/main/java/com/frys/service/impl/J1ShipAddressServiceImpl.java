package com.frys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frys.model.J1ShipAddress;
import com.frys.repository.IJ1ShipAddressRepository;
import com.frys.service.J1ShipAddressService;

@Service
public class J1ShipAddressServiceImpl implements J1ShipAddressService {

	@Autowired
	IJ1ShipAddressRepository j1ShipAddressRespository;
	
	@Override
	public List<J1ShipAddress> getShippingDetailByOrderId(String orderId) {
		System.out.println("gagan getShippingDetailByOrderId: orderId: "+orderId);
		List<J1ShipAddress> orderShipDetails = j1ShipAddressRespository.findByOrderId(orderId);
		for(J1ShipAddress order: orderShipDetails) {
			System.out.println("gagan frys getShippingDetailByOrderId(): "+order.getOrderId()+", "+order.getShipMethod());
		}
		return orderShipDetails;
	}

}
