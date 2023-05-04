public class Main {

    public static void main(String[] args) {


//        List<Entity> entities = new ArrayList<>();
//        Herbivore herbivore = new Herbivore(1, 2);
//        herbivore.getSymbol();
//        System.out.println(herbivore.getCoordinates().getSizeY());
//        Grass grass = new Grass(2,3);
//        grass.getCoordinates().getSizeX();

        WordMap wordMap = new WordMap(5, 5);
        wordMap.fillMapEmptyObject();
        wordMap.drawMap();

    }
}
