package com.joaopinho.pocstate.state;

import com.joaopinho.pocstate.Game;

public class MenuState extends State {
    public MenuState(Game game){
        super(game);
        game.setPlaying(false);
    }

    @Override
    public String onPlay() {
        game.setState(new PlayingState(game));
        game.setPlaying(true);
        return "Starting game...";
    }

    @Override
    public String onMenu() {
        return "Already in menu...";
    }

    @Override
    public String onPause() {
        return "Cannot pause in menu...";

    }

    @Override
    public String onGameOver() {
        return "How did you get here?";
    }


}
