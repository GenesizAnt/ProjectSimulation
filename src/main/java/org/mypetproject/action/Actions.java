package org.mypetproject.action;

import org.mypetproject.Coordinates;
import org.mypetproject.WorldMap;
import org.mypetproject.entity.Entity;
import org.mypetproject.entity.Grass;
import org.mypetproject.entity.creature.Herbivore;
import org.mypetproject.entity.creature.Predator;
import org.mypetproject.entity.stationary.Rock;
import org.mypetproject.entity.stationary.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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

    public void turnAction() {

    }
}
