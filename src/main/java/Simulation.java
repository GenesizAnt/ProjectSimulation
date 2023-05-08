
//Суть проекта - пошаговая симуляция 2D мира, населённого травоядными и хищниками.
//Кроме существ, мир содержит ресурсы (траву), которым питаются травоядные,
// и статичные объекты, с которыми нельзя взаимодействовать - они просто занимают место.
/*
Главный класс приложения, включает в себя:
Карту
Счётчик ходов
Рендерер поля
Actions - список действий, исполняемых перед стартом симуляции или на каждом ходу (детали ниже)
 */

import java.util.LinkedList;
import java.util.List;

public class Simulation {

    private int sizeX;
    private int sizeY;
    private WorldMap fieldWorld;
    private List<Creature> entities = new LinkedList<>();
    private List<CreatureNoLife> creatureNoLives = new LinkedList<>();
    Actions actions;
    private boolean isSimulationPause;
    private int turnCount;

    public Simulation(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.fieldWorld = new WorldMap(sizeX, sizeY);
    }

    public void fillMapEmptyObject() {
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                fieldWorld.setCoordinateDrawable(i, j, new Empty());
            }
        }
    }

    public void startSimulation() throws InterruptedException {

        positionEntity();

        while (!isSimulationPause) {
            showWorldMap();
            entityTurn();
            checkIsSimulationPause(turnCount);
            Thread.sleep(1000);
        }

    }

    private void positionEntity() {

    }

    private void entityTurn() {
        for (Creature creature : entities) {
            creature.makeMove();
        }
        turnCount++;
    }

    private void predatorMove() {
    }

    private void herbivoreMove() {

    }

    private void showWorldMap() {
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
