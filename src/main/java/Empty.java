public class Empty extends Entity implements Drawable {
    public Empty(int coordinates_x, int coordinates_y) {
        super(coordinates_x, coordinates_y);
    }

    @Override
    public String getSymbol() {
        return " . ";
    }
}
