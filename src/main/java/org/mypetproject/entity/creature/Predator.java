package org.mypetproject.entity.creature;

import org.mypetproject.Coordinates;
import org.mypetproject.WorldMap;
import org.mypetproject.entity.Grass;
import org.mypetproject.entity.Ground;
import org.mypetproject.entity.stationary.Rock;
import org.mypetproject.entity.stationary.Tree;

//Переместиться (чтобы приблизиться к жертве - травоядному)
//Атаковать травоядное. При этом количество HP травоядного уменьшается на силу атаки хищника. Если значение HP жертвы опускается до 0, травоядное исчезает
public class Predator extends Creature {

    private int attackPower;

    public Predator() {
        setAttackPower();
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void makeMove(WorldMap fieldWorld) {
        int sizeX = coordinates.getSizeX();
        int sizeY = coordinates.getSizeY();
        int deltaSizeX = 1 - (int) ((Math.random() * 3));
        int deltaSizeY = 1 - (int) ((Math.random() * 3));
        int newSizeX = sizeX + deltaSizeX;
        int newSizeY = sizeY + deltaSizeY;

        if ((newSizeX < 0) || (newSizeY < 0) || (newSizeX >= fieldWorld.getSizeX()) || newSizeY >= fieldWorld.getSizeY()
                || fieldWorld.getFieldWorldEntity(newSizeX, newSizeY) instanceof Rock
                || fieldWorld.getFieldWorldEntity(newSizeX, newSizeY) instanceof Tree) {
        } else {
            if (fieldWorld.getFieldWorldEntity(newSizeX, newSizeY) instanceof Herbivore) {
                Herbivore herbivore = (Herbivore) fieldWorld.getFieldWorldEntity(newSizeX, newSizeY);
                herbivore.setLossHP(this.getAttackPower());
                this.setBeforeEatHP();
                if (herbivore.getHealthPoint() < 1) {
                    fieldWorld.setCoordinateEntityCoordinate(this, newSizeX, newSizeY);
                    fieldWorld.setCoordinateDrawable(new Ground(new Coordinates(sizeX, sizeY)));
                    this.setCoordinates(new Coordinates(newSizeX, newSizeY));
                }
            } else if (fieldWorld.getFieldWorldEntity(newSizeX, newSizeY) instanceof Predator) {
                Predator predator = (Predator) fieldWorld.getFieldWorldEntity(newSizeX, newSizeY);
                predator.setLossHP(this.getAttackPower());
                if (predator.getHealthPoint() < 10 && !(((sizeX - deltaSizeX) < 0) || ((sizeY - deltaSizeY) < 0)
                        || (sizeX - deltaSizeX >= fieldWorld.getSizeX()) || sizeY - deltaSizeY >= fieldWorld.getSizeY()
                        || fieldWorld.getFieldWorldEntity(sizeX - deltaSizeX, sizeY - deltaSizeY) instanceof Rock
                        || fieldWorld.getFieldWorldEntity(sizeX - deltaSizeX, sizeY - deltaSizeY) instanceof Tree
                        || fieldWorld.getFieldWorldEntity(sizeX - deltaSizeX, sizeY - deltaSizeY) instanceof Predator
                        || fieldWorld.getFieldWorldEntity(sizeX - deltaSizeX, sizeY - deltaSizeY) instanceof Herbivore)) {
                    fieldWorld.setCoordinateEntityCoordinate(this, sizeX - deltaSizeX, sizeY - deltaSizeY);
                    fieldWorld.setCoordinateDrawable(new Ground(new Coordinates(sizeX, sizeY)));
                    this.setCoordinates(new Coordinates(sizeX - deltaSizeX, sizeY - deltaSizeY));
                }
            } else if (fieldWorld.getFieldWorldEntity(newSizeX, newSizeY) instanceof Ground) {
                fieldWorld.setCoordinateEntityCoordinate(this, newSizeX, newSizeY);
                fieldWorld.setCoordinateDrawable(new Ground(new Coordinates(sizeX, sizeY)));
                this.setCoordinates(new Coordinates(newSizeX, newSizeY));
            }
        }
    }

    private void setAttackPower() {
        this.attackPower = (int) (Math.random() * 5) + 1;
    }

    public void setBeforeEatHP() {
        setHealthPoint(5);
    }

    @Override
    public String getSymbol() {
        return "  \u03A8  ";
    }
}
