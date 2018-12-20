package com.revature.pojo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="battle_table")
public class Battle {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="battleid")
	private int battleid;
	
	@OneToOne
	@JoinColumn(name="userid")
	private User user;
	
	@OneToOne
	@JoinColumn(name="playlistid")
	private Playlist playlist;

	public Battle() {

	}

	public Battle(int id, int battleid, User user, Playlist playlist) {
		super();
		this.id = id;
		this.battleid = battleid;
		this.user = user;
		this.playlist = playlist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBattleid() {
		return battleid;
	}

	public void setBattleid(int battleid) {
		this.battleid = battleid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}

	@Override
	public String toString() {
		return "Battle [id=" + id + ", battleid=" + battleid + ", user=" + user + ", playlist=" + playlist + "]";
	}

}
