
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
import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Simulation {
    public static void nextTurn() {

    }

    public static void startSimulation() {

    }

    public static void pauseSimulation() {

    }

    public static void generateWord(List<Entity> entities) {

        String[][] wordMap = new String[50][50];

        System.out.println();

        for (int i = 0; i < entities.size(); i++) {
//            System.out.println();
            for (int j = 0; j < entities.size(); j++) {
//                System.out.print(wordMap[i][j].getSymbol());
            }
            System.out.println();
        }
    }
}
