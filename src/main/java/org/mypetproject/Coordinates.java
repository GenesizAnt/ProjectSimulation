package org.mypetproject;

import java.util.Objects;

public class Coordinates {

    private int sizeX;
    private int sizeY;

    public Coordinates(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public Coordinates() {

    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return sizeX == that.sizeX && sizeY == that.sizeY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeX, sizeY);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
