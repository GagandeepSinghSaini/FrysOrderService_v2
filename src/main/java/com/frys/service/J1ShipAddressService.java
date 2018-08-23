package com.frys.service;

import java.util.List;

import com.frys.model.J1ShipAddress;

public interface J1ShipAddressService {

	public List<J1ShipAddress> getShippingDetailByOrderId(String orderId);
	
}

