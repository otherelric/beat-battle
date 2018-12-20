package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.dao.BattleDao;
import com.revature.dao.PlaylistDao;
import com.revature.dao.UserDao;
import com.revature.pojo.Battle;
import com.revature.pojo.Playlist;
import com.revature.pojo.User;

@Service
public class AuthService {
	
	UserDao userDao = new UserDao();
	PlaylistDao playlistDao = new PlaylistDao();
	BattleDao battleDao = new BattleDao();
	
	public User validateUser(User user){
		User validUser = null;
		User uDao = userDao.getUser(user.getUsername());
		
		//System.out.println("AUTH_SERVICE: " + uDao.toString());
		
		if (user.getUsername().equals(uDao.getUsername()) && user.getPassword().equals(uDao.getPassword())){
			validUser = uDao;
		}
		return validUser;
	}
	
	public Playlist doesPlaylistExist(Playlist playlist) {
		
		if(playlistDao.getPlaylist(playlist.getName()) != null) {
			System.out.println("This playlist exists!");
			return playlistDao.getPlaylist(playlist.getName());
		}else {
			playlistDao.setPlaylist(playlist);
			return null;
		}
	}
	
	public Battle doesBattleExist(int i) {
		return battleDao.getBattle(i);
	}
	
	public void createNewBattle(Battle battle) {
		battleDao.createBattle(battle);
	}
	
}
