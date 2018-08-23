package com.frys.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frys.model.J1Order;

@Repository
public interface IJ1OrderRepository extends CrudRepository<J1Order, Long> {
	
	List<J1Order> findByOrderId(String orderId);
	List<J1Order> findByUserId(String userId);
	
}
