package org.mypetproject.entity.creature;

import org.mypetproject.entity.creature.Creature;

//Переместиться (чтобы приблизиться к жертве - травоядному)
//Атаковать травоядное. При этом количество HP травоядного уменьшается на силу атаки хищника. Если значение HP жертвы опускается до 0, травоядное исчезает
public class Predator extends Creature {

    private int attackPower;
    private int attackDistance;

    public Predator() {
        setAttackDistance();
        setAttackPower();
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

    private void setAttackPower() {
        this.attackPower = (int) (Math.random() * 5) + 1;
    }

    private void setAttackDistance() {
        this.attackDistance = (int) (Math.random() * 3) + 1;
    }

    @Override
    public String getSymbol() {
        return "  X  ";
    }
}
