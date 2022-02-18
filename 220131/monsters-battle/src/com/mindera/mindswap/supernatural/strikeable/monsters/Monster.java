package com.mindera.mindswap.supernatural.strikeable.monsters;

import com.mindera.mindswap.supernatural.Supernatural;
import com.mindera.mindswap.supernatural.strikeable.Strikeable;
import com.mindera.mindswap.util.Messages;

public abstract class Monster extends Supernatural implements Strikeable {

    private MonsterType type;

    public Monster(int hitPower, MonsterType type) {
        super(hitPower);
        this.hitPower = hitPower;
        this.type = type;
        health = 100;
        dead = false;
    }

    public int attack() {
        System.out.printf(Messages.MONSTER_ATTACK, this.toString());
        return hitPower;
    }

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

    @Override
    public String toString() {
        return type.getDescription();
    }
}
}
