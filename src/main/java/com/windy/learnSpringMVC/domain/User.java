package com.windy.learnSpringMVC.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users") 
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, unique = true) 
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@Column
	private String address;

	@Column(name = "phone_number")
	private String phoneNumber;

	public User() {
	}

	public User(long id, String email, String password, String fullName, String address, String phoneNumber) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", email=" + email + ", password=" + password + ", fullName=" + fullName
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
}
