package org.mypetproject.entity;

import org.mypetproject.Coordinates;
import org.mypetproject.entity.stationary.CreatureNoLife;

//ресурс для травоядных
public class Grass extends CreatureNoLife {

    private int sourceOfLife;

    public Grass() {
        this.coordinates = new Coordinates();
        setSourceOfLife();
    }

    public Grass(Coordinates coordinates) {
        this.coordinates = coordinates;
        setSourceOfLife();
    }

    public int getSourceOfLife() {
        return sourceOfLife;
    }

    private void setSourceOfLife() {
        this.sourceOfLife = (int) (Math.random() * 5) + 1;
    }

    @Override
    public String getSymbol() {
        return " ,,, ";
    }
}
