package com.revature.pojo;

public class User {

	private int id;
	private String username;
	private String password;
	private String tag;
	private String type;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String username, String password, String tag, String type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.tag = tag;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
