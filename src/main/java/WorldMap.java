import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WorldMap {

    private int sizeX;
    private int sizeY;
    private Drawable[][] fieldWorld;

    public WorldMap(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        fieldWorld = new Drawable[sizeX][sizeY];
    }
    public void setCoordinateDrawable(int x, int y, Drawable entity) {
        fieldWorld[x][y] = entity;
    }

    public void drawMap() {
        for (int i = 0; i < sizeX; i++) {
            System.out.println();
            for (int j = 0; j < sizeY; j++) {
                System.out.print(fieldWorld[i][j].getSymbol());
            }
        }
    }

    public Drawable[][] getFieldWorld() {
        return fieldWorld;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }
}
