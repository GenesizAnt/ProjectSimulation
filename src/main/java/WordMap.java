
import java.util.List;

//Карта, содержит в себе коллекцию для хранения существ и их расположения.
// Советую не спешить использовать двумерный массив или список списков, а подумать какие ещё коллекции могут подойти.
public class WordMap {

    private List<Entity> entities;

    public WordMap(List<Entity> entities) {
        this.entities = entities;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }
}
