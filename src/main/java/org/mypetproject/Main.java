package org.mypetproject;

import org.mypetproject.action.Actions;
import org.mypetproject.entity.Grass;
import org.mypetproject.entity.creature.Herbivore;
import org.mypetproject.entity.creature.Predator;

public class Main {
    public static void main(String[] args) {

        Simulation simulation = new Simulation(5, 5);
        simulation.fillMapEmptyObject();
        try {
            simulation.startSimulation();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
