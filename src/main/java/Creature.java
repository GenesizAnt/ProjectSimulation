
public abstract class Creature extends Entity {

    private int speed;
    private int healthPoint;

    public Creature(int coordinates_x, int coordinates_y) {
        super(coordinates_x, coordinates_y);
        setHealthPoint();
        setSpeed();
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed() {
        this.speed = (int) (Math.random() * 3) + 1;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    private void setHealthPoint() {
        this.healthPoint = (int) (Math.random() * 50) + 1;
    }

    abstract void makeMove();
}