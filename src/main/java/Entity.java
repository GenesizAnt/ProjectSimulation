
//Корневой абстрактный класс для всех существ и объектов существующих в симуляции
public abstract class Entity {

    private final int WEIGHT_OBJECT_IN_MAP = 1;

    private int coordinate_x;
    private int coordinate_y;
    private String symbol;

    // TODO: 04.05.2023 Сделать отдельный класс для отрисовки карты
    // TODO: 04.05.2023 Сделать отдельный класс Координата!!!

    public Entity(int coordinates_x, int coordinates_y) {
        this.coordinate_x = coordinates_x;
        this.coordinate_y = coordinates_y;
    }

    public int getWEIGHT_OBJECT_IN_MAP() {
        return WEIGHT_OBJECT_IN_MAP;
    }

    public int getCoordinate_x() {
        return coordinate_x;
    }

    public void setCoordinate_x(int coordinate_x) {
        this.coordinate_x = coordinate_x;
    }

    public int getCoordinate_y() {
        return coordinate_y;
    }

    public void setCoordinate_y(int coordinate_y) {
        this.coordinate_y = coordinate_y;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
