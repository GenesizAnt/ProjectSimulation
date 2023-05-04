
import java.util.HashMap;
import java.util.Map;

//Карта, содержит в себе коллекцию для хранения существ и их расположения.
// Советую не спешить использовать двумерный массив или список списков, а подумать какие ещё коллекции могут подойти.
public class WordMap {

    private int sizeX;
    private int sizeY;
    private Map<Coordinates, Entity> entities;
    private Drawable[][] field;

    public WordMap(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        field = new Drawable[sizeX][sizeY];
        entities = new HashMap<>();
    }

    public Map<Coordinates, Entity> getEntities() {
        return entities;
    }

    public void setEntities(Map<Coordinates, Entity> entities) {
        this.entities = entities;
    }

    public void fillMapEmptyObject() {
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                entities.put(new Coordinates(i, j), new Empty(i, j));
                field[i][j];
            }
        }
    }

    public void setCoordinateDrawable(int x, int y, Entity entity) {
        field[x][y] = entity;
    }

    public void drawMap() {

        Entity[][] entities1 = new Entity[sizeX][sizeY];

        for (Entity entity : entities.values()) {
            System.out.print(entity.getSymbol());
        }


//        for (int i = 0; i < sizeX; i++) {
//            System.out.println();
//            for (int j = 0; j < sizeY; j++) {
//                for(Entity entity : entities.values()) {
//                    System.out.print(entity.getSymbol());
//                }
//            }
//        }
    }
}
