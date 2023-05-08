
//статичные объекты на поле
public class Rock extends CreatureNoLife {

    public Rock(int sizeX, int sizeY) {
        super(sizeX, sizeY);
    }

    @Override
    public String getSymbol() {
        return " <^> ";
    }
}
