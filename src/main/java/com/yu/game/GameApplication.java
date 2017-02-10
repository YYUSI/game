package com.yu.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.yu.game.dao.GameDAO;
import com.yu.game.model.Game;

@SpringBootApplication
public class GameApplication implements CommandLineRunner{
    
	@Autowired
	private GameDAO gameDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
        gameDAO.save(new Game("Game1","do nothing","not started"));
        gameDAO.save(new Game("Game2","write spring-boot","not started"));
	}
}
