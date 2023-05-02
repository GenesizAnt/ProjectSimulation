
//Стремятся найти ресурс (траву), может потратить свой ход на движение в сторону травы, либо на её поглощение
public class Herbivore extends Creature {


    public Herbivore(int coordinates_x, int coordinates_y) {
        super(coordinates_x, coordinates_y);
        setSymbol(" o ");
    }

    @Override
    void makeMove() {

    }
}
