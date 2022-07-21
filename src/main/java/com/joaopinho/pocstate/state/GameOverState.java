package com.joaopinho.pocstate.state;

import com.joaopinho.pocstate.Game;

public class GameOverState extends State {
    GameOverState(Game game){
        super(game);
        game.setPlaying(false);
    }

    @Override
    public String onPlay() {
        game.setState(new PlayingState(game));
        game.setPlaying(true);
        game.setCurrentStageNewGame();
        return "Starting new game...";
    }

    @Override
    public String onMenu() {
        game.setState(new MenuState(game));
        game.setPlaying(false);
        return "Returning to menu...";
    }

    @Override
    public String onPause() {
        return "Cannot pause...";
    }

    @Override
    public String onGameOver() {
        return "Game Over!";
    }


}
