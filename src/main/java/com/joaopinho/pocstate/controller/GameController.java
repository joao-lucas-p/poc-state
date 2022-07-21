package com.joaopinho.pocstate.controller;

import com.joaopinho.pocstate.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private Game game;

    @PutMapping("/play")
    public String play(){
        return game.getState().onPlay();
    }

    @PutMapping("/pause")
    public String pause(){
        return game.getState().onPause();
    }

    @PutMapping("/game-over")
    public String gameOver(){
        return game.getState().onGameOver();
    }

    @PutMapping("/menu")
    public String menu(){
        return game.getState().onMenu();
    }

    @GetMapping("/current-stage")
    public String currentStage(){
        return game.currentStage();
    }

    @PutMapping("/next-stage")
    public String nextStage(){
        return game.nextStage();
    }

}
