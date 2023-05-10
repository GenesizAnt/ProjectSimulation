package org.mypetproject;

import org.mypetproject.entity.creature.Herbivore;
import org.mypetproject.entity.creature.Predator;

public class Main {
    public static void main(String[] args) {

        Simulation simulation = new Simulation(25, 25);
        simulation.fillMapEmptyObject();
        try {
            simulation.startSimulation();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
