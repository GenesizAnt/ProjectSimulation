package org.mypetproject.action;

import org.mypetproject.Coordinates;
import org.mypetproject.WorldMap;
import org.mypetproject.entity.Entity;
import org.mypetproject.entity.Grass;
import org.mypetproject.entity.Ground;
import org.mypetproject.entity.creature.Creature;
import org.mypetproject.entity.stationary.CreatureNoLife;

import java.util.*;

public class FindingPath {

    private List<Coordinates> checkPlace = new ArrayList<>();
    private List<Coordinates> explorationPlace = new ArrayList<>();
    private CreatureNoLife desiredObject;
    private Entity[][] wordMap;
    private Map<Coordinates, Coordinates> parentMap = new HashMap<>();


    public List<Coordinates> findTargetEntity(WorldMap getWorldMap, Entity creature, CreatureNoLife desiredObject) {

        List<Coordinates> wayDesiredObject = new ArrayList<>();
        
        wordMap = getWorldMap.getFieldWorld();
        explorationPlace.add(creature.getCoordinates());
        checkPlace.add(creature.getCoordinates());
//
//        if (checkPlace.contains(creature.getCoordinates())) {
//            explorationPlace.remove(creature.getCoordinates());
//        } else
            if (parentMap.keySet().getClass().equals(desiredObject.getClass())) {
            wayDesiredObject.addAll(findChildEntity(getWorldMap, creature));
        } else {
            explorationPlace.addAll(findChildEntity(getWorldMap, creature));
        }

        wayDesiredObject.addAll(explorerChildEntity(explorationPlace, getWorldMap, desiredObject));

        return wayDesiredObject;
    }

    private List<Coordinates> explorerChildEntity(List<Coordinates> explorationPlace, WorldMap getWorldMap, CreatureNoLife desiredObject) {

        List<Coordinates> wayDesiredObject = new ArrayList<>();

        for (int i = 0; i < explorationPlace.size(); i++) {
            findChildEntity(getWorldMap, getWorldMap.getEntityWithWorldMap(explorationPlace.get(0).getSizeX(), explorationPlace.get(0).getSizeY()));
            if (parentMap.keySet().getClass().equals(desiredObject.getClass())) {
                wayDesiredObject.addAll(findChildEntity(getWorldMap, getWorldMap.getEntityWithWorldMap(explorationPlace.get(0).getSizeX(), explorationPlace.get(0).getSizeY())));
            } else {
                i++;
            }
        }
        wayDesiredObject.add(new Coordinates(1000,1000));
        return wayDesiredObject;
    }

    public List<Coordinates> findChildEntity(WorldMap getWorldMap, Entity creature) {

        List<Coordinates> childEntity = new ArrayList<>();

        int startX = creature.getCoordinates().getSizeX() - 1;
        if (startX < 0) {
            startX = 0;
        }

        int startY = creature.getCoordinates().getSizeY() - 1;
        if (startY < 0) {
            startY = 0;
        }

        int endX = creature.getCoordinates().getSizeX() + 1;
        if (endX > getWorldMap.getFieldWorld().length) {
            endX = getWorldMap.getFieldWorld().length - 1;
        }

        int endY = creature.getCoordinates().getSizeY() + 1;
        if (endY > getWorldMap.getFieldWorld()[0].length) {
            endY = getWorldMap.getFieldWorld()[0].length - 1;
        }


        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if (getWorldMap.getFieldWorld()[i][j] instanceof Ground) {
                    parentMap.put(getWorldMap.getFieldWorld()[i][j].getCoordinates(), creature.getCoordinates());
                    childEntity.add(getWorldMap.getFieldWorld()[i][j].getCoordinates());
                } else if (getWorldMap.getFieldWorld()[i][j] instanceof Grass) {
                    parentMap.put(getWorldMap.getFieldWorld()[i][j].getCoordinates(), creature.getCoordinates());
                    return getWayDesiredObject();
                }

            }
        }


        return childEntity;
    }

    private List<Coordinates> getWayDesiredObject() {
        List<Coordinates> wayDesiredObject = new ArrayList<>();

        return wayDesiredObject;
    }
}