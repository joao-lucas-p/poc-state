package com.joaopinho.pocstate.state;

import com.joaopinho.pocstate.Game;

public class PlayingState extends State {
    PlayingState(Game game){
        super(game);
        game.setPlaying(false);
    }

    @Override
    public String onPlay() {
        return onPause();
    }

    @Override
    public String onMenu() {
        game.setState(new MenuState(game));
        game.setPlaying(false);
        game.setCurrentStageNewGame();
        return "Returning to menu...";
    }

    @Override
    public String onPause() {
        game.setState(new PauseState(game));
        game.setPlaying(false);
        return "Pausing...";
    }

    @Override
    public String onGameOver() {
        game.setState(new GameOverState(game));
        game.setPlaying(false);
        return "Game Over!";
    }



}
