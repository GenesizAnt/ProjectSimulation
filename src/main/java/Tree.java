
//статичные объекты на поле
public class Tree extends CreatureNoLife {

    public Tree(int sizeX, int sizeY) {
        super(sizeX, sizeY);
    }

    @Override
    public String getSymbol() {
        return " `|` ";
    }
}
