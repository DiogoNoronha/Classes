package academy.mindswap.monsters;

import academy.mindswap.Messages;

public abstract class Monster {

    protected int health;
    protected int attack;
    protected boolean isAlive;

    public Monster(){
        this.health = 20;
        this.attack = 5;
        this.isAlive = true;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0){
            this.isAlive = false;;
        }
    }

    public boolean getIsAlive(){
        return this.isAlive;
    }
}
