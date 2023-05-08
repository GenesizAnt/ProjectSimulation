package org.mypetproject;

import org.mypetproject.entity.creature.Herbivore;
import org.mypetproject.entity.creature.Predator;

public class Main {
    public static void main(String[] args) {

        Simulation simulation = new Simulation(10, 10);
        simulation.fillMapEmptyObject();
        try {
            simulation.startSimulation();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
