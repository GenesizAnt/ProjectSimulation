package org.mypetproject.entity.creature;

import org.mypetproject.WorldMap;
import org.mypetproject.action.FindingPath;
import org.mypetproject.entity.Entity;
import org.mypetproject.entity.stationary.CreatureNoLife;

public abstract class Creature extends Entity {

    private int speed;
    private int healthPoint;
    private FindingPath findingPath;

    public Creature() {
        setHealthPoint();
        setSpeed();
    }

    public FindingPath getFindingPath() {
        return findingPath;
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed() {
        this.speed = (int) (Math.random() * 3) + 1;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    private void setHealthPoint() {
        this.healthPoint = (int) (Math.random() * 50) + 1;
    }

    abstract void makeMove(WorldMap worldMap, CreatureNoLife creatureNoLife);
}
