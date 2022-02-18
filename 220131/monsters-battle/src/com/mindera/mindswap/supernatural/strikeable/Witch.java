package com.mindera.mindswap.supernatural.strikeable;

import com.mindera.mindswap.supernatural.Supernatural;
import com.mindera.mindswap.util.Messages;

public class Witch extends Supernatural implements Strikeable {



    @Override
    public void suffer(int damage) {
        if (health - damage <= 0) {
            health = 0;
            dead = true;
            System.out.printf(Messages.DEAD_MONSTER, this);
            return;
        }

        health -= damage;
        System.out.printf(Messages.MONSTER_SUFFER, this, damage, health);
    }
}
