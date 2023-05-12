package org.mypetproject.action;

import org.mypetproject.Coordinates;
import org.mypetproject.WorldMap;
import org.mypetproject.entity.Entity;
import org.mypetproject.entity.Grass;
import org.mypetproject.entity.creature.Creature;
import org.mypetproject.entity.creature.Herbivore;
import org.mypetproject.entity.creature.Predator;
import org.mypetproject.entity.stationary.CreatureNoLife;
import org.mypetproject.entity.stationary.Rock;
import org.mypetproject.entity.stationary.Tree;

import java.util.*;

public class Actions {
    public void initAction(WorldMap worldMap, int quantityHerbivore, int quantityPredator, int quantityRock, int quantityTree, int quantityGrass) {

        if (quantityGrass + quantityHerbivore + quantityPredator + quantityRock + quantityTree >
                ((worldMap.getSizeX() * worldMap.getSizeY()))) {
            System.out.println("Draw element map incorrect, please enter any count");
        }

        Map<Integer, Integer> mapCountEntity = new HashMap<>();
        mapCountEntity.put(0, quantityHerbivore);
        mapCountEntity.put(1, quantityPredator);
        mapCountEntity.put(2, quantityRock);
        mapCountEntity.put(3, quantityTree);
        mapCountEntity.put(4, quantityGrass);

        for (int i = 0; i < mapCountEntity.size(); i++) {

            int quantityEntity = mapCountEntity.get(i);

            for (int j = 0; j < quantityEntity; j++) {
                if (i == 0) {
                    Herbivore herbivore = new Herbivore();
                    drawRandomPlaceInWorld(worldMap, herbivore);
                    worldMap.setCoordinateDrawable(herbivore);
                }
                if (i == 1) {
                    Predator predator = new Predator();
                    drawRandomPlaceInWorld(worldMap, predator);
                    worldMap.setCoordinateDrawable(predator);
                }
                if (i == 2) {
                    Rock rock = new Rock();
                    drawRandomPlaceInWorld(worldMap, rock);
                    worldMap.setCoordinateDrawable(rock);
                }
                if (i == 3) {
                    Tree tree = new Tree();
                    drawRandomPlaceInWorld(worldMap, tree);
                    worldMap.setCoordinateDrawable(tree);
                }
                if (i == 4) {
                    Grass grass = new Grass();
                    drawRandomPlaceInWorld(worldMap, grass);
                    worldMap.setCoordinateDrawable(grass);
                }
            }
        }
    }

    private void drawRandomPlaceInWorld(WorldMap worldMap, Entity entity) {
        int sizeXWorld = worldMap.getSizeX();
        int sizeYWorld = worldMap.getSizeY();

        Random random = new Random();

        int randomSizeX = random.nextInt(sizeXWorld);
        int randomSizeY = random.nextInt(sizeYWorld);

        Coordinates coordinates = new Coordinates(randomSizeX, randomSizeY);

        entity.setCoordinates(coordinates);
        worldMap.setCoordinateDrawable(entity);
    }

    public Coordinates findTargetEntity(WorldMap worldMap, Creature creature, CreatureNoLife creatureNoLife) {
        Set<Coordinates> checkCoordinates = new HashSet<>();
        Coordinates targetCoordinates = new Coordinates();
        boolean isNoTargetFind = true;
        int checkDiapasonX = 1;

        if (creature instanceof Herbivore) {
            checkCoordinates.add(creature.getCoordinates());

            while (isNoTargetFind) {

                int startX = creature.getCoordinates().getSizeX() - checkDiapasonX;
                if (startX < 0) {
                    startX = 0;
                }

                int startY = creature.getCoordinates().getSizeY() - checkDiapasonX;
                if (startY < 0) {
                    startY = 0;
                }

                int endX = creature.getCoordinates().getSizeX() + checkDiapasonX;
                if (endX > worldMap.getFieldWorld().length) {
                    endX = worldMap.getFieldWorld().length - 1;
                }

                int endY = creature.getCoordinates().getSizeY() + checkDiapasonX;
                if (endY > worldMap.getFieldWorld()[0].length) {
                    endY = worldMap.getFieldWorld()[0].length - 1;
                }

                while (isNoTargetFind) {
                    for (int j = startX; j <= endX; j++) {
                        for (int k = startY; k <= endY; k++) {
                            if (worldMap.getFieldWorld()[j][k] instanceof Grass) {
                                targetCoordinates.setSizeX(j);
                                targetCoordinates.setSizeY(k);
                                return targetCoordinates;
                            }
                            checkDiapasonX++;
                            break;
                        }
                    }
                }
            }
        }
        return null;
    }
}
























