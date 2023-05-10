package org.mypetproject.entity.creature;

import org.mypetproject.WorldMap;
import org.mypetproject.entity.Entity;

public abstract class Creature extends Entity {

    private int healthPoint;

    public Creature() {
        this.healthPoint = (int) (Math.random() * 20) + 1;;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint += healthPoint;
    }

    public void setLossHP(int attackDamage) {
        healthPoint -= attackDamage;
    }

    public abstract void makeMove(WorldMap fieldWorld);
}
