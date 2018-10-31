package com.cg.parallelproject.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerwallet")
public class Customer {

	@Column(name="name")
	private String name;
	@Id
	@Column(name="mobileno")
	private String mobileNo;
	//private Wallet wallet;
	@Column(name="balance")
private double balance;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
//	public Customer(String name2, String mobileNo2, Wallet wallet2) {
//		this.name=name2;
//		mobileNo=mobileNo2;
//		wallet=wallet2;
//}
	public Customer(String name, String mobileNo, double balance) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.balance = balance;
	}
	public Customer()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
@Override
	public String toString() {
		return "Customer [name=" + name + ", mobileNo=" + mobileNo
				+ ", balance=" + balance + "]";
	}
	
	
}


