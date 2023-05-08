package org.mypetproject.entity.stationary;

import org.mypetproject.Coordinates;
import org.mypetproject.entity.stationary.CreatureNoLife;

//статичные объекты на поле
public class Rock extends CreatureNoLife {

    public Rock(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Rock() {
        this.coordinates = new Coordinates();
    }

    @Override
    public String getSymbol() {
        return " [@] ";
    }
}
