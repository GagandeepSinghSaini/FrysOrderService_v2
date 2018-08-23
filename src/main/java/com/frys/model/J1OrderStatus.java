package com.frys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// create table j1_order_status (ORDER_STATUS varchar(10), DESCRIPTION varchar(30))

@Entity
@Table(name = "J1_ORDER_STATUS")
public class J1OrderStatus {

	@Id
	@Column(name = "ORDER_STATUS")
	private String orderStatus;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
