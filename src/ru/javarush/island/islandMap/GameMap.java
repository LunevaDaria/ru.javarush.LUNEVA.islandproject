package ru.javarush.island.islandMap;
import ru.javarush.island.organismes.Organism;
import java.lang.reflect.Type;
import java.util.*;

public class GameMap {
    private Cell[][] cells;
    public ArrayList<Cell> listOfCells;
    private static int length;
    private static int width;
    private static int size = 0;


    public GameMap(int length, int width) {
        this.length = length;
        this.width = width;
        this.cells = new Cell[width][length];
    }

    public void addLocations() {
        int id = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                this.cells[i][j] = new Cell(addResidents(Organism.addAnimals()), ++id);
            }
        }
    }

    public Map<Type, ArrayList<Organism>> addResidents(HashSet<Organism> settlers) {
        Map<Type, ArrayList<Organism>> residents = new HashMap<>();
        for (Organism organism : Organism.organisms) {
            Type type = organism.getClass();
            residents.put(type, organism.settle(organism));

        }
        return residents;
    }

    public ArrayList<Cell> createListOfCells() {
        listOfCells = new ArrayList();
        for (Cell[] i : cells) {
            listOfCells.addAll(Arrays.asList(i));
        }
        size = listOfCells.size();
        return listOfCells;
    }
    public void setNextCells() {
        int id = 1;
        for (int i = id; i <= size; i++) {
            Map<Direction, Cell> nextCells1 = new HashMap<>();
            if (i > GameMap.width) {
                Cell upCell = listOfCells.get(i-1 - GameMap.width);
                nextCells1.put(Direction.UP, upCell);
            }
            if (i <= (size - GameMap.width)) {
                Cell downCell = listOfCells.get(i-1 + GameMap.width);
                nextCells1.put(Direction.DOWN, downCell);
            }
            if (i % GameMap.width != 0) {
                Cell rightCell = listOfCells.get(i-1  + 1);
                nextCells1.put(Direction.RIGHT, rightCell);
            }
            if (i % GameMap.width != 1) {
                Cell leftCell = listOfCells.get(i-1 - 1);
                nextCells1.put(Direction.LEFT, leftCell);
            }
            Cell.NEXT_CELLS.put(i,nextCells1);
        }
    }
    @Override
    public String toString() {
        return "Карта острова: " +
                Arrays.deepToString(cells);
    }

}
