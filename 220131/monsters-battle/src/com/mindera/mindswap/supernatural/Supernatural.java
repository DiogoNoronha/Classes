package com.mindera.mindswap.supernatural;

import com.mindera.mindswap.supernatural.strikeable.monsters.MonsterType;

public abstract class Supernatural {

    private int hitPower;
    private int health;
    private boolean dead;


    public Supernatural(int hitPower) {
        this.hitPower = hitPower;
        health = 100;
        dead = false;
    }

    public boolean isDead() {
        return this.dead;
    }

    public int getHealth() {
        return health;
    }

    void setHealth(int health) {
        this.health = health;
    }
}

