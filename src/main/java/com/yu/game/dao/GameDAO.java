package com.yu.game.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yu.game.model.Game;

public interface GameDAO extends PagingAndSortingRepository<Game,Long> {
	List<Game> findByName(String name);

}
