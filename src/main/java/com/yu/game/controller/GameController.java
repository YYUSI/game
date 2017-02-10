package com.yu.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yu.game.dao.GameDAO;
import com.yu.game.model.Game;

public class GameController {
	@Autowired
	private GameDAO gameDAO;
	
	@RequestMapping()
	public String home(){
		return "<h1>Hello World</h1>" ;
	} 
	@RequestMapping(path="/createGroup",method=RequestMethod.GET)
	public @ResponseBody Game createGame(
			@RequestParam(value="name",required=false) String name){
		return new Game(name,"","");
	}
	@RequestMapping(value="/group/{name}",method=RequestMethod.GET)
	public Game createGame2(
			@PathVariable String name) {
		return new Game(name,"","");
	}
}
