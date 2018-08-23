package com.frys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// create table J1_ORDER (ORDER_ID varchar(30), STORE_ID varchar(10), USER_ID varchar(40), ORDER_STATUS varchar(10), EXT_ORDER_NUMBER varchar(30));

@Entity
@Table(name = "J1_ORDER")
public class J1Order {

	@Id
	@Column(name = "ORDER_ID")
	private String orderId;
	
	@Column(name = "STORE_ID")
	private String storeId;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "ORDER_STATUS")
	private String orderStatus;
	
	@Column(name = "EXT_ORDER_NUMBER")
	private String extOrderNumber;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getExtOrderNumber() {
		return extOrderNumber;
	}
	public void setExtOrderNumber(String extOrderNumber) {
		this.extOrderNumber = extOrderNumber;
	}	
	
}
