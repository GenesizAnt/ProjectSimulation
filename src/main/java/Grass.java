
//ресурс для травоядных
public class Grass extends Entity {

    public final int HEALTH_UP = 3;

    public Grass(int coordinates_x, int coordinates_y) {
        super(coordinates_x, coordinates_y);
        int health_up = HEALTH_UP;
    }

    public int getHEALTH_UP() {
        return HEALTH_UP;
    }

    @Override
    public String getSymbol() {
        return null;
    }
}
