package org.mypetproject.entity.creature;

import org.mypetproject.entity.creature.Creature;

//Стремятся найти ресурс (траву), может потратить свой ход на движение в сторону травы, либо на её поглощение
public class Herbivore extends Creature {

    @Override
    void makeMove() {

    }

    @Override
    public String getSymbol() {
        return "  O  ";
    }
}
