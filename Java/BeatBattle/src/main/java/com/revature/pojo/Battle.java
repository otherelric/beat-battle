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
	@Column(name="battleid")
	private int id;
	
	@OneToOne
	@JoinColumn(name="userid")
	private User user;
	
	@OneToMany(mappedBy="id", fetch=FetchType.EAGER)
	//@JoinColumn(name="playlistid")
	private Set<Playlist> playlist;

	public Battle() {

	}

	public Battle(int id, User user, Set<Playlist> playlist) {
		super();
		this.id = id;
		this.user = user;
		this.playlist = playlist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getuser() {
		return user;
	}

	public void setuser(User user) {
		this.user = user;
	}

	public Set<Playlist> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Set<Playlist> playlist) {
		this.playlist = playlist;
	}

	@Override
	public String toString() {
		return "Battle [id=" + id + ", user=" + user + ", playlist=" + playlist + "]";
	}

}
