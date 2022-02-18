package com.mindera.mindswap;

public enum Hands {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String pick;

    private Hands(String pick){
        this.pick = pick;
    }

    public String getPick() {
        return pick;
    }
}
