package com.frys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frys.model.J1PaymentMethod;
import com.frys.repository.IJ1PaymentMethodRepostiory;
import com.frys.service.J1PaymentMethodService;

@Service
public class J1PaymentMethodServiceImpl implements J1PaymentMethodService {

	@Autowired
	IJ1PaymentMethodRepostiory j1PaymentMethodRepository;
	
	@Override
	public List<J1PaymentMethod> getDetailByCreditNumber(String cardNumber) {
		List<J1PaymentMethod> paymentList = j1PaymentMethodRepository.findByCardNumber(cardNumber);
		for(J1PaymentMethod payment: paymentList) {
			System.out.println("gagan frys getDetailByCreditNumber: "+payment.getCardOwner()+", "+payment.getUserId());
		}
		return paymentList;
	}

}
