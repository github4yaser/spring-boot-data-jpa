package com.cloudstudio.service.springbootdatajpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_INFO")
public class AccountInfoEntity implements Serializable {
	
	@Id
	@Column(name="ACCID")
	private int accId;
	@Column(name="CUSTOMERNAME")
	private String accName;
	@Column(name="AMOUNT")
	private int amount;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

	
	
	
	
	
	
	
	/*
	 * 
	 CREATE TABLE ACCOUNT_INFO (
accId NUMBER(5),
customerName varchar2(255),
amount NUMBER(5),
PRIMARY KEY (accId)
)

	 * 
	 */
}
