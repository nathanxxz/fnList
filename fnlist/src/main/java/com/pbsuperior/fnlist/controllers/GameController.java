package com.pbsuperior.fnlist.controllers;

import com.pbsuperior.fnlist.dto.GameMinDTO;
import com.pbsuperior.fnlist.entities.Game;
import com.pbsuperior.fnlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result=gameService.findAll();
        return  result;
    }
}
