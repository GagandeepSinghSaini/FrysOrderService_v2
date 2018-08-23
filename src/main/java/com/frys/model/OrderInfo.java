package com.frys.model;

public class OrderInfo {

	private String orderId;
	private String extOrderId;
	private String location;
	private String status;
	private String carrier;
	private String emailAddress;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getExtOrderId() {
		return extOrderId;
	}
	public void setExtOrderId(String extOrderId) {
		this.extOrderId = extOrderId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", extOrderId=" + extOrderId + ", location=" + location + ", status="
				+ status + ", carrier=" + carrier + ", emailAddress=" + emailAddress + "]";
	}
	
	
}
