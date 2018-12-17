package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {

	@Id
	@Column(name="userid")
	private Integer id;
	
	@Column(name="usern")
	private String username;
	
	@Column(name="passw")
	private String password;

	@Column(name="tag")
	private String tag;
	
	@Column(name="user_type")
	private String type;
	
	public User() {
		super();
	}
	
	public User(Integer id, String password, String tag, String type, String username) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.tag = tag;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", tag=" + tag + ", type="
				+ type + "]";
	}

}
