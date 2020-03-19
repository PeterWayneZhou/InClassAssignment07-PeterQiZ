package com.example.inclassassignment05_peterqiz;

import java.io.Serializable;

public class Game implements Serializable {
    String gameTitle;
    String monthOfRelease;
    String genre;
    boolean consoleExclusive;

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public void setMonthOfRelease(String monthOfRelease) {
        this.monthOfRelease = monthOfRelease;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setConsoleExclusive(boolean consoleExclusive) {
        this.consoleExclusive = consoleExclusive;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public String getMonthOfRelease() {
        return monthOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public Boolean getConsoleExclusive(){
        return consoleExclusive;
    }
}
