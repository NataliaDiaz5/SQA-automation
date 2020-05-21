package com.newtours.bookfligtht.pruebas.models;

public class Register {
	String firstName;
	String lastName;	
	String phone;
	String email;
	String address;
	String city;
	String state;
	String postalCode;
	String userName;
	String password;
	String confirmPassword;
	
	public Register(String firstName, String lastName, String phone, String email, String address, String city,
			String state, String postalCode, String userName, String password, String confirmPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public final String getFirstName() {
		return firstName;
	}
	public final String getLastName() {
		return lastName;
	}
	public final String getPhone() {
		return phone;
	}
	public final String getEmail() {
		return email;
	}
	public final String getAddress() {
		return address;
	}
	public final String getCity() {
		return city;
	}
	public final String getState() {
		return state;
	}
	public final String getPostalCode() {
		return postalCode;
	}
	public final String getUserName() {
		return userName;
	}
	public final String getPassword() {
		return password;
	}
	public final String getConfirmPassword() {
		return confirmPassword;
	}
	
}
