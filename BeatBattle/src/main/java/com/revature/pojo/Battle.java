package com.revature.pojo;

public class Battle {
	
	private int id;
	private int userId;
	private int playlistId;

	public Battle() {
		// TODO Auto-generated constructor stub
	}

	public Battle(int id, int userId, int playlistId) {
		super();
		this.id = id;
		this.userId = userId;
		this.playlistId = playlistId;
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

	public int getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}

	@Override
	public String toString() {
		return "Battle [id=" + id + ", userId=" + userId + ", playlistId=" + playlistId + "]";
	}

}
