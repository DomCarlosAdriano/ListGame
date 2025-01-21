package com.devsuperior.aslist.repoditories;

import com.devsuperior.aslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository< Game, Long > {
}
