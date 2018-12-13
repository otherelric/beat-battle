package com.revature.pojo;

public class Song {
	
	private int id;
	private int spotifyId;
	private int name;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(int id, int spotifyId, int name) {
		super();
		this.id = id;
		this.spotifyId = spotifyId;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSpotifyId() {
		return spotifyId;
	}

	public void setSpotifyId(int spotifyId) {
		this.spotifyId = spotifyId;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", spotifyId=" + spotifyId + ", name=" + name + "]";
	}

}
