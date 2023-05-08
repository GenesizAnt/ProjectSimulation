package org.mypetproject.entity.stationary;

import org.mypetproject.Coordinates;
import org.mypetproject.entity.stationary.CreatureNoLife;

//статичные объекты на поле
public class Tree extends CreatureNoLife {

    public Tree(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Tree() {
        this.coordinates = new Coordinates();
    }

    @Override
    public String getSymbol() {
        return " `|` ";
    }
}
