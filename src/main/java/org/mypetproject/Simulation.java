package org.mypetproject;
//Суть проекта - пошаговая симуляция 2D мира, населённого травоядными и хищниками.
//Кроме существ, мир содержит ресурсы (траву), которым питаются травоядные,
// и статичные объекты, с которыми нельзя взаимодействовать - они просто занимают место.
/*
Главный класс приложения, включает в себя:
Карту
Счётчик ходов
Рендерер поля
org.mypetproject.action.Actions - список действий, исполняемых перед стартом симуляции или на каждом ходу (детали ниже)
 */

import org.mypetproject.action.Actions;
import org.mypetproject.entity.Entity;
import org.mypetproject.entity.Ground;
import org.mypetproject.entity.creature.Creature;
import org.mypetproject.entity.stationary.CreatureNoLife;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    private int sizeX;
    private int sizeY;
    private WorldMap fieldWorld;
    private List<Entity> entities = new ArrayList<>();
    private List<Creature> creatures = new ArrayList<>();
    private List<CreatureNoLife> creatureNoLives = new ArrayList<>();
    private Actions actions = new Actions();
    private boolean isSimulationPause;
    private int daySimulation;
    private int quantityHerbivore = 5;
    private int quantityPredator = 5;
    private int quantityRock = 10;
    private int quantityTree = 10;
    private int quantityGrass = 10;

    public Simulation(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.fieldWorld = new WorldMap(sizeX, sizeY);
    }

    public void fillMapEmptyObject() {
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                fieldWorld.setCoordinateDrawable(new Ground(new Coordinates(i, j)));
            }
        }
    }

    public void startSimulation() throws InterruptedException {

        actions.initAction(this.fieldWorld, quantityHerbivore, quantityPredator, quantityRock, quantityTree, quantityGrass);

        while (!isSimulationPause) {
            showWorldMap();
            entityTurn();
            checkIsSimulationPause(daySimulation);
            Thread.sleep(1000);
        }

    }

    private void positionEntity() {

    }

    private void entityTurn() {

    }

    private void predatorMove() {
    }

    private void herbivoreMove() {

    }

    private void showWorldMap() {
        System.out.print("\nSimulation World day " + daySimulation);
        fieldWorld.drawMap();
    }

    private boolean checkIsSimulationPause(int turnCount) {
        //дать на выбор несколько вариантов как продолжать дальнейшую симуляцию
        //после 10 ходов пауза
        //если сьели всех животных
        //вопрос - хотите перейти на пошаговую симуляцию 
        return false;
    }

    public void nextTurn() {

    }

//    public static void pauseSimulation() {
//
//    }

}
