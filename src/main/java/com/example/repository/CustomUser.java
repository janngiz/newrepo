package com.example.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class CustomUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String firstName;

	private String lastName;
	private String email;
	private String password;

//	@ManyToOne
//	private Roles roles;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

//	public Roles getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Roles roles) {
//		this.roles = roles;
//	}

}
