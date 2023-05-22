package org.mypetproject.entity.creature;

import org.mypetproject.Coordinates;
import org.mypetproject.WorldMap;
import org.mypetproject.action.FindingPath;
import org.mypetproject.entity.Grass;
import org.mypetproject.entity.Ground;
import org.mypetproject.entity.creature.Creature;
import org.mypetproject.entity.stationary.CreatureNoLife;
import org.mypetproject.entity.stationary.Rock;
import org.mypetproject.entity.stationary.Tree;

import java.util.List;

//Стремятся найти ресурс (траву), может потратить свой ход на движение в сторону травы, либо на её поглощение
public class Herbivore extends Creature {

    @Override
    public void makeMove(WorldMap worldMap, CreatureNoLife creatureNoLife) {

        FindingPath findingPath = new FindingPath();

        List<Coordinates> wayTo = findingPath.findTargetEntity(worldMap, this, creatureNoLife);

//        int sizeX = coordinates.getSizeX();
//        int sizeY = coordinates.getSizeY();
//        int deltaSizeX = 1 - (int) ((Math.random() * 3));
//        int deltaSizeY = 1 - (int) ((Math.random() * 3));
//        int newSizeX = sizeX + deltaSizeX;
//        int newSizeY = sizeY + deltaSizeY;
//
//        if ((newSizeX < 0) || (newSizeY < 0) || (newSizeX >= fieldWorld.getSizeX()) || newSizeY >= fieldWorld.getSizeY()
//                || fieldWorld.getFieldWorldEntity(newSizeX, newSizeY) instanceof Rock
//                || fieldWorld.getFieldWorldEntity(newSizeX, newSizeY) instanceof Tree) {
//        } else {
//            if (fieldWorld.getFieldWorldEntity(newSizeX, newSizeY) instanceof Grass) {
//                Grass grass = (Grass) fieldWorld.getFieldWorldEntity(newSizeX, newSizeY);
//                this.setHealthPoint(grass.getSourceOfLife());
//                fieldWorld.setCoordinateEntityCoordinate(this, newSizeX, newSizeY);
//                fieldWorld.setCoordinateDrawable(new Ground(new Coordinates(sizeX, sizeY)));
//                this.setCoordinates(new Coordinates(newSizeX, newSizeY));
//            } else if (fieldWorld.getFieldWorldEntity(newSizeX, newSizeY) instanceof Predator) {
//                if (((sizeX - deltaSizeX) < 0) || ((sizeY - deltaSizeY) < 0) || (sizeX - deltaSizeX >= fieldWorld.getSizeX()) || sizeY - deltaSizeY >= fieldWorld.getSizeY()
//                        || fieldWorld.getFieldWorldEntity(sizeX - deltaSizeX, sizeY - deltaSizeY) instanceof Rock
//                        || fieldWorld.getFieldWorldEntity(sizeX - deltaSizeX, sizeY - deltaSizeY) instanceof Tree
//                        || fieldWorld.getFieldWorldEntity(sizeX - deltaSizeX, sizeY - deltaSizeY) instanceof Predator
//                        || fieldWorld.getFieldWorldEntity(sizeX - deltaSizeX, sizeY - deltaSizeY) instanceof Herbivore) {
//                } else {
//                    fieldWorld.setCoordinateEntityCoordinate(this, sizeX - deltaSizeX, sizeY - deltaSizeY);
//                    fieldWorld.setCoordinateDrawable(new Ground(new Coordinates(sizeX, sizeY)));
//                    this.setCoordinates(new Coordinates(sizeX - deltaSizeX, sizeY - deltaSizeY));
//                }
//            } else if (fieldWorld.getFieldWorldEntity(newSizeX, newSizeY) instanceof Ground) {
//                fieldWorld.setCoordinateEntityCoordinate(this, newSizeX, newSizeY);
//                fieldWorld.setCoordinateDrawable(new Ground(new Coordinates(sizeX, sizeY)));
//                this.setCoordinates(new Coordinates(newSizeX, newSizeY));
//            }
//        }
    }

    @Override
    public String getSymbol() {
        return "  O  ";
    }
}
