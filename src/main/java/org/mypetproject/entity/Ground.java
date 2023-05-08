package org.mypetproject.entity;

import org.mypetproject.Coordinates;
import org.mypetproject.Drawable;

public class Ground extends Entity {

    public Ground(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Ground() {
        this.coordinates = new Coordinates();
    }

    @Override
    public String getSymbol() {
        return "  .  ";
    }
}
