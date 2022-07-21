package com.joaopinho.pocstate.state;

import com.joaopinho.pocstate.Game;

public abstract class State {
    Game game;

    State(Game game){
        this.game = game;
    }

    public abstract String onPlay();
    public abstract String onMenu();
    public abstract String onPause();
    public abstract String onGameOver();
}
