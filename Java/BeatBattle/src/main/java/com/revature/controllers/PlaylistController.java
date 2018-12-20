package com.revature.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.Playlist;
import com.revature.pojo.User;
import com.revature.service.AuthService;

@RestController("/playlist")
@CrossOrigin(origins= "*")
public class PlaylistController {
		
		@Autowired
		AuthService authServ;
		
		@GetMapping
		public Playlist getPlaylist(@RequestBody Playlist playlist, BindingResult bindingResult, HttpSession sess, ModelMap modelMap) {
			Playlist authPlaylist = authServ.doesPlaylistExist(playlist);			
			return authPlaylist;
		}
		
		@PostMapping
		public void createPlaylist(@RequestBody Playlist playlist, BindingResult bindingResult, HttpSession sess, ModelMap modelMap) {
			User curUser = (User)sess.getAttribute("user");
			
			if(curUser != null && "po".equals(curUser.getType())) {
				if(authServ.doesPlaylistExist(playlist) != null) {
					//send a message back saying that the playlist exists
				}else 
				{
					//send back a success message here? maybe? idk? sure?
				}
			}
		}
}
