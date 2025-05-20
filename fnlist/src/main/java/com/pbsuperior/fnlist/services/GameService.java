package com.pbsuperior.fnlist.services;

import com.pbsuperior.fnlist.dto.GameMinDTO;
import com.pbsuperior.fnlist.entities.Game;
import com.pbsuperior.fnlist.repositories.IGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private IGameRepository iGameRepository;
    public List<GameMinDTO> findAll(){
       var result= iGameRepository.findAll();
        List<GameMinDTO> dto=result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
