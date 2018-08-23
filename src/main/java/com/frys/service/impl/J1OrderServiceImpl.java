package com.frys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frys.model.J1Order;
import com.frys.repository.IJ1OrderRepository;
import com.frys.service.J1OrderService;

@Service
public class J1OrderServiceImpl implements J1OrderService {

	@Autowired
	IJ1OrderRepository j1OrderRepository;
	
	@Override
	public List<J1Order> getAllOrdersByOrderId(String orderId) {
		List<J1Order> orderDetails = j1OrderRepository.findByOrderId(orderId);
		for (J1Order order : orderDetails) {
            System.out.println("Gagan  Frys getAllOrdersByOrderId: "+order.getExtOrderNumber());
        }
		return orderDetails;
	}

	@Override
	public List<J1Order> getAllOrdersByUserId(String userId) {
		List<J1Order> orderDetails = j1OrderRepository.findByUserId(userId);
		for (J1Order order : orderDetails) {
            System.out.println("Gagan Frys getAllOrdersByUserId: "+order.getExtOrderNumber());
        }
		return orderDetails;
	}

}
