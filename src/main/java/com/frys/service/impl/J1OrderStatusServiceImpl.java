package com.frys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frys.model.J1OrderStatus;
import com.frys.repository.IJ1OrderStatusRepository;
import com.frys.service.J1OrderStatusService;

@Service
public class J1OrderStatusServiceImpl implements J1OrderStatusService {

	@Autowired
	IJ1OrderStatusRepository j1OrderStatusRepository;
	
	@Override
	public List<J1OrderStatus> getOrderStatusDetails() {
		List<J1OrderStatus> orderStatusList = j1OrderStatusRepository.findAll();
		for(J1OrderStatus orderStatus: orderStatusList) {
			System.out.println("-- gagan frys getOrderStatusDetails: ["+orderStatus.getOrderStatus()+", "+orderStatus.getDescription()+"]");
		}
		return orderStatusList;
	}

}
