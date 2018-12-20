package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="playlist_table")
public class Playlist {

	@Id
	@Column(name="playlistid")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	
	@Column(name="pname")
	private String name;

//	@ManyToOne
//	@JoinColumn(name="bname")
//	private Battle battle;
	
	@Column(name="tag")
	private String tag;

	public Playlist() {
		// TODO Auto-generated constructor stub
	}
	
	public Playlist(int id, User user, String name, String tag) {
		super();
		this.id = id;
		this.user = user;
		this.name = name;
		this.tag = tag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		return "Playlist [id=" + id + ", user=" + user + ", name=" + name + ", tag=" + tag + "]";
	}
	
}
