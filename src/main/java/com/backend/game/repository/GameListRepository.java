package com.backend.game.repository;

import com.backend.game.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository  extends JpaRepository<GameList, Long> {
}
