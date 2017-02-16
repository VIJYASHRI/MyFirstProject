package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private  String firstname;
	private String lastname;
	private String email;
	private String phoneNumber;
	@OneToOne
	@JoinColumn(name="user_id")
	private Users users;
	@OneToOne
	@JoinColumn(name="BillingAddresss_id")
	private BillingAddress billingAddress;
	
	@OneToOne
	@JoinColumn(name="ShippingAddress_id")
	private ShippingAddress shippingAddress;
	
	@OneToOne
	@JoinColumn(name="cart_id")
	private Cart cart;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
