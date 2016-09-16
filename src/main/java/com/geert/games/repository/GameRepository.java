package com.geert.games.repository;

import com.geert.games.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aryastark on 16/09/16.
 */
public interface GameRepository extends JpaRepository<Game, Integer>{
}
