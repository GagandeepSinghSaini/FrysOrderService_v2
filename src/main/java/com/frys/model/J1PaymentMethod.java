package com.frys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
// create table J1_PAYMENT_METHOD (OBJECT_ID varchar(30), METHOD_TAG varchar(10), PO_CARD_NO varchar(20), NAME_ON_CARD varchar(20), OWNER_TYPE varchar(5))

@Entity
@Table(name = "J1_PAYMENT_METHOD")
public class J1PaymentMethod {

	@Id
	@Column(name = "OBJECT_ID")
	private String userId;
	
	@Column(name = "METHOD_TAG")
	private String MethodTag;
	
	@Column(name = "PO_CARD_NO")
	private String cardNumber;
	
	@Column(name = "NAME_ON_CARD")
	private String cardOwner;
	
	@Column(name = "OWNER_TYPE")
	private String ownerType;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMethodTag() {
		return MethodTag;
	}
	public void setMethodTag(String methodTag) {
		MethodTag = methodTag;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardOwner() {
		return cardOwner;
	}
	public void setCardOwner(String cardOwner) {
		this.cardOwner = cardOwner;
	}
	public String getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
	
	
}
