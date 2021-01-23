package com.example.repository;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Roles {

	private long id;
	private String name;

	@OneToMany(mappedBy = "roles")
	private List<CustomUser> users;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CustomUser> getUsers() {
		return users;
	}

	public void setUsers(List<CustomUser> users) {
		this.users = users;
	}

}
