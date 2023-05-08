public class Main {

    public static void main(String[] args) {

        startGame();

    }

    public static void startGame() {
        Simulation simulation = new Simulation(10, 10);
        simulation.fillMapEmptyObject();
        try {
            simulation.startSimulation();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
