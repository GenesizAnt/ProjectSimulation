
//ресурс для травоядных
public class Grass extends CreatureNoLife {

    private int sourceOfLife;

    public Grass(int sizeX, int sizeY) {
        super(sizeX, sizeY);
        setSourceOfLife();
    }

    public int getSourceOfLife() {
        return sourceOfLife;
    }

    private void setSourceOfLife() {
        this.sourceOfLife = (int) (Math.random() * 5) + 1;
    }

    @Override
    public String getSymbol() {
        return " ,~, ";
    }
}
