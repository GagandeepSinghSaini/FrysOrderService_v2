package com.frys.service;

import java.util.List;

import com.frys.model.J1PaymentMethod;

public interface J1PaymentMethodService {

	public List<J1PaymentMethod> getDetailByCreditNumber(String cardNumber);
	
}
