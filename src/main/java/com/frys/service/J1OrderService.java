package com.frys.service;

import java.util.List;

import com.frys.model.J1Order;

public interface J1OrderService {

	public List<J1Order> getAllOrdersByOrderId(String orderId);
	public List<J1Order> getAllOrdersByUserId(String userId);
	
}
