
//Суть проекта - пошаговая симуляция 2D мира, населённого травоядными и хищниками.
//Кроме существ, мир содержит ресурсы (траву), которым питаются травоядные,
// и статичные объекты, с которыми нельзя взаимодействовать - они просто занимают место.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Simulation {

    public static void main(String[] args) {

/*
Главный класс приложения, включает в себя:
Карту
Счётчик ходов
Рендерер поля
Actions - список действий, исполняемых перед стартом симуляции или на каждом ходу (детали ниже)
 */
        List<Entity> entities = new ArrayList<>();
        entities.add(new Herbivore(1, 2));
        entities.add(new Predator(1, 2, 2));
        entities.add(new Grass(4, 5));
        entities.add(new Rock(7, 9));
        entities.add(new Tree(24, 13));
        WordMap wordMap1 = new WordMap(entities);
        generateWord(entities);

    }

    public static void nextTurn() {

    }

    public static void startSimulation() {

    }

    public static void pauseSimulation() {

    }

    public static void generateWord(List<Entity> entities) {

        Entity[][] wordMap = new Entity[50][50];

        System.out.println();

        for (int i = 0; i < entities.size(); i++) {
//            System.out.println();
            for (int j = 0; j < entities.size(); j++) {
                System.out.print(wordMap[i][j].getSymbol());
            }
            System.out.println();
        }
    }
}
