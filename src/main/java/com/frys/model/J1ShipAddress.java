package com.frys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// create table J1_SHIP_ADDRESS (ORDER_ID varchar(30), EMAIL varchar(20), SHIP_METHOD varchar(10))

@Entity
@Table(name = "J1_SHIP_ADDRESS")
public class J1ShipAddress {

	@Id
	@Column(name = "ORDER_ID")
	private String orderId;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "SHIP_METHOD")
	private String shipMethod;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getShipMethod() {
		return shipMethod;
	}
	public void setShipMethod(String shipMethod) {
		this.shipMethod = shipMethod;
	}
	
	
	
}
