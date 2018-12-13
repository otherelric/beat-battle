package com.revature.pojo;

public class Playlist {

	private int id;
	private int userId;
	private String name;
	private String tag;

	public Playlist() {
		// TODO Auto-generated constructor stub
	}
	
	public Playlist(int id, int userId, String name, String tag) {
		super();
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.tag = tag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Playlist [id=" + id + ", userId=" + userId + ", name=" + name + ", tag=" + tag + "]";
	}
	
}
