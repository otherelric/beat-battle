package com.revature.dao;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.pojo.Playlist;
import com.revature.pojo.User;
import com.revature.util.SessionUtil;

public class PlaylistDao {
	
	public Playlist getPlaylist(String playlistName) {
		Session session = SessionUtil.getSession();
		Criteria criteria = session.createCriteria(Playlist.class);
		Playlist playlist = (Playlist) criteria.add(Restrictions.eq("pname", playlistName)).uniqueResult();
		return playlist;
	}
	
	public void setPlaylist(Playlist playlist) {
		Session session = SessionUtil.getSession();
		
		Transaction t = session.beginTransaction();
		Integer newID = (Integer)session.save(playlist);
		Playlist newPlaylist = session.load(Playlist.class, newID);
		t.commit();
		session.close();
		System.out.println("A new playlist was made (inside playlistDAO): " + newPlaylist);
	}
	
	
	//this will be for retrieving the users playlists.. will figure this out later :3
//	public List<Playlist> getMyPlaylists (User user){
//		List<Playlist> myPlaylists = new ArrayList<Playlist>();
//		Session session = SessionUtil.getSession();
//		Criteria criteria = session.createCriteria(Playlist.class);
//		Playlist playlist = (Playlist) criteria.add(Restrictions.eq("user", user));
//		return myPlaylists;
//	}
//	
}
