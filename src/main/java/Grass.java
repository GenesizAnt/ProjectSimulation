
//ресурс для травоядных
public class Grass extends Entity {

    public final int HEALTH_UP = 3;

    public Grass(int coordinates_x, int coordinates_y) {
        super(coordinates_x, coordinates_y);
        setSymbol(" '.' ");
    }
}
