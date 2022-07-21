package com.joaopinho.pocstate.state;

import com.joaopinho.pocstate.Game;

public class PauseState extends State {
    PauseState(Game game){
        super(game);
        game.setPlaying(false);
    }

    @Override
    public String onPlay() {
        game.setState(new PlayingState(game));
        game.setPlaying(true);
        return "Unpaused...";    }

    @Override
    public String onMenu() {
        game.setState(new MenuState(game));
        game.setPlaying(false);
        return "Returning to menu...";
    }

    @Override
    public String onPause() {
        return this.onPlay();
    }

    @Override
    public String onGameOver() {
        game.setState(new GameOverState(game));
        game.setPlaying(false);
        return "Game Over!";
    }


}
