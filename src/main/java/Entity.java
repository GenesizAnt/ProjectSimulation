
//Корневой абстрактный класс для всех существ и объектов существующих в симуляции
public abstract class Entity implements Drawable {

    private Coordinates coordinates;

    // TODO: 04.05.2023 Сделать отдельный класс для отрисовки карты

    public Entity(int coordinates_x, int coordinates_y) {
        coordinates = new Coordinates(coordinates_x, coordinates_y);
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
