package com.frys.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frys.model.J1ShipAddress;

@Repository
public interface IJ1ShipAddressRepository extends CrudRepository<J1ShipAddress, Long> {

	List<J1ShipAddress> findByOrderId(String orderId);	
	
}
