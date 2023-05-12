package org.mypetproject;

import org.mypetproject.entity.Entity;

public class WorldMap {

    private int sizeX;
    private int sizeY;
    private Entity[][] fieldWorld;

    public WorldMap(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.fieldWorld = new Entity[sizeX][sizeY];
    }
    public void setCoordinateDrawable(Entity entity) {
        Coordinates coordinates = entity.getCoordinates();
        fieldWorld[coordinates.getSizeX()][coordinates.getSizeY()] = entity;
    }

    public Entity getEntityWithWorldMap(int sizeX, int sizeY) {
        return fieldWorld[sizeX][sizeY];
    }

    public void drawMap() {
        for (Entity[] entities : fieldWorld) {
            System.out.println();
            for (Entity entity : entities) {
                System.out.print(fieldWorld[entity.getCoordinates().getSizeX()][entity.getCoordinates().getSizeY()].getSymbol());
            }
        }
    }

//    public void drawMap() {
//        for (int i = 0; i < sizeX; i++) {
//            System.out.println();
//            for (int j = 0; j < sizeY; j++) {
//                System.out.print(fieldWorld[i][j].getSymbol());
//            }
//        }
//        System.out.println();
//    }


    public Entity[][] getFieldWorld() {
        return fieldWorld;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

}
