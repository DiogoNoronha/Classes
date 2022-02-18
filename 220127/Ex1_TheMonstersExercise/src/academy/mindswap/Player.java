package academy.mindswap;

import academy.mindswap.monsters.*;

public class Player {
    private String name;
    private Monster[] hand;
    private int monsterInPlay;

    public Player(String name) {
        this.name = name;
    }

    public void setHandSize(int handSize) {
        this.hand = new Monster[handSize];
        System.out.printf(Messages.PLAYERS_TEAM, this.name);
        for (int i = 0; i < this.hand.length; i++) {
        this.hand[i] = MonsterFactory.randomMonsterGenerator();
        System.out.println(this.hand[i].toString());
        }
    }

    public void chosenMonster() {
        int min = 0;
        int max = this.hand.length - 1;
        int randomInt = (int) (Math.random() * (max - min + 1) + min);
        if (!hand[randomInt].getIsAlive()) {
            chosenMonster();
            return;
        }
        this.monsterInPlay = randomInt;
        System.out.printf(Messages.PICK_MONSTER, this.name, this.hand[this.monsterInPlay].toString());
    }

    public int sendAttack() {
        int attackValue = this.hand[this.monsterInPlay].getAttack();
        System.out.printf(Messages.MONSTER_DEALS, this.hand[this.monsterInPlay].toString(), attackValue);
        return attackValue;
    }

    public void receiveAttack(int attack) {
        this.hand[this.monsterInPlay].setHealth(attack);
        System.out.printf(Messages.MONSTER_HEALTH, this.hand[this.monsterInPlay].toString(), this.hand[this.monsterInPlay].getHealth());
    }

    public boolean checkLooser() {
        for (int i = 0; i < hand.length; i++) {
            if (this.hand[i].getIsAlive()) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return this.name;
    }
}

