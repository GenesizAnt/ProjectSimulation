
//Переместиться (чтобы приблизиться к жертве - травоядному)
//Атаковать травоядное. При этом количество HP травоядного уменьшается на силу атаки хищника. Если значение HP жертвы опускается до 0, травоядное исчезает
public class Predator extends Creature {

    private final int attackPower;
    private int attackDistance;

    public Predator(int speed, int healthPoint, int attackPower) {
        super(speed, healthPoint);
        this.attackPower = attackPower;
        setSymbol(" X ");
    }

    @Override
    void makeMove() {

    }
}
