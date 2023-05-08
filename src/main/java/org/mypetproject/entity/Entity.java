package org.mypetproject.entity;
import org.mypetproject.Coordinates;
import org.mypetproject.Drawable;

//Корневой абстрактный класс для всех существ и объектов существующих в симуляции
public abstract class Entity implements Drawable {

    protected Coordinates coordinates;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
