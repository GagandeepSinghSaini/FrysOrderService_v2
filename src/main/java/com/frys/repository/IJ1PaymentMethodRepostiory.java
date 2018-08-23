package com.frys.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frys.model.J1PaymentMethod;

@Repository
public interface IJ1PaymentMethodRepostiory extends CrudRepository<J1PaymentMethod, Long> {

	List<J1PaymentMethod> findByCardNumber(String cardNumber);
	
}
