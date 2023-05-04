
//Стремятся найти ресурс (траву), может потратить свой ход на движение в сторону травы, либо на её поглощение
public class Herbivore extends Creature {


    public Herbivore(int coordinates_x, int coordinates_y) {
        super(coordinates_x, coordinates_y);
    }

    @Override
    public int getHealthPoint() {
        return super.getHealthPoint();
    }

    @Override
    public Coordinates getCoordinates() {
        return super.getCoordinates();
    }

    @Override
    public void setCoordinates(Coordinates coordinates) {
        super.setCoordinates(coordinates);
    }

    @Override
    void makeMove() {

    }

    @Override
    public String getSymbol() {
        return null;
    }
}
