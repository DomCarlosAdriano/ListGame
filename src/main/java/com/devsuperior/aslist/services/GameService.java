package com.devsuperior.aslist.services;

import com.devsuperior.aslist.dto.GameMinDTO;
import com.devsuperior.aslist.entities.Game;
import com.devsuperior.aslist.repoditories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
      List<Game> result =  gameRepository.findAll();
      List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;
    }
}
