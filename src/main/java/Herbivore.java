
//Стремятся найти ресурс (траву), может потратить свой ход на движение в сторону травы, либо на её поглощение
public class Herbivore extends Creature {

    public Herbivore(int sizeX, int sizeY) {
        super(sizeX, sizeY);
    }

    @Override
    void makeMove() {

    }

    @Override
    public String getSymbol() {
        return " O ";
    }
}
