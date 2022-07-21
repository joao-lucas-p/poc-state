package com.joaopinho.pocstate;

import com.joaopinho.pocstate.state.MenuState;
import com.joaopinho.pocstate.state.State;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Game {
    private State state;
    private boolean playing;
    private List<String> stages = new ArrayList<>();
    private int currentStage;

    public Game(){
        this.state = new MenuState(this);
        setPlaying(false);
        for (int i = 1; i <=12; i++){
            stages.add("Stage " + i);
        }
    }

    public void changeState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public List<String> getStages() {
        return stages;
    }

    public void setStages(List<String> stages) {
        this.stages = stages;
    }

    public int getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(int currentStage) {
        this.currentStage = currentStage;
    }

    public String currentStage(){
        return stages.get(currentStage);
    }

    public String nextStage(){
        if (isPlaying()){
            currentStage++;
            if (currentStage > stages.size() - 1){
                this.setCurrentStageNewGame();
            }
            return stages.get(currentStage);
        }
        return "Can't change stages!";
    }

    public void setCurrentStageNewGame(){
        this.currentStage = 0;
    }
}
