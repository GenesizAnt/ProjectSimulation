
//Переместиться (чтобы приблизиться к жертве - травоядному)
//Атаковать травоядное. При этом количество HP травоядного уменьшается на силу атаки хищника. Если значение HP жертвы опускается до 0, травоядное исчезает
public class Predator extends Creature {

    private final int attackPower;
    private final int attackDistance;

    public Predator(int coordinates_x, int coordinates_y, int attackPower) {
        super(coordinates_x, coordinates_y);
        this.attackPower = attackPower;
        attackDistance = 3;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getAttackDistance() {
        return attackDistance;
    }

    @Override
    void makeMove() {

    }

    @Override
    public String getSymbol() {
        return null;
    }
}
