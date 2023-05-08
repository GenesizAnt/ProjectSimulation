
//Корневой абстрактный класс для всех существ и объектов существующих в симуляции
public abstract class Entity implements Drawable {

    private int sizeX;
    private int sizeY;

    public Entity(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
}
