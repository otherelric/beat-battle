package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="song_table")
public class Song {
	
	@Id
	@Column(name="songid")
	private int id;
	
	@Column(name="spotifyid")
	private String spotifyId;
	
	@Column(name="sname")
	private int name;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(int id, String spotifyId, int name) {
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

	public String getSpotifyId() {
		return spotifyId;
	}

	public void setSpotifyId(String spotifyId) {
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
