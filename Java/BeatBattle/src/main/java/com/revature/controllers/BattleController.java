package com.revature.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.Battle;
import com.revature.pojo.User;
import com.revature.service.AuthService;

@RestController
@RequestMapping("/battle")
@CrossOrigin(origins= "*")
public class BattleController {

	@Autowired
	AuthService authServ;
	
//	@GetMapping
//	public List<Battle> GetAllBattles(){
//		
//		
//	}
	
	public List<Battle> getBattle(@RequestBody Battle battle, BindingResult bindingResult, HttpSession sess, ModelMap modelMap) {
		return authServ.doesBattleExist(battle.getId());
	}
	
	
//	@GetMapping("/{id}")
//	public Battle getBattleById(@PathVariable int id) {
//		
//	}
	
	/*@PostMapping("/doOtherStuff") //just testing... not fr
	public void createBattle(@RequestBody Battle battle, BindingResult bindingResult, HttpSession sess, ModelMap modelMap) {
		User curUser = (User)sess.getAttribute("user");
		if(curUser != null && "bo".equals(curUser.getType())) {
			if(authServ.doesBattleExist(battle.getId()) != null) {
				//this battle exist... send back that message to user somehow :)
			}else {
				authServ.createNewBattle(battle);
			}
		}
	}
	*/
}
