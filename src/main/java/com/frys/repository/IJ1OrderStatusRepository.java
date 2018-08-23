package com.frys.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frys.model.J1OrderStatus;

@Repository
public interface IJ1OrderStatusRepository extends CrudRepository<J1OrderStatus, Long>{

	List<J1OrderStatus> findAll();
	
}
