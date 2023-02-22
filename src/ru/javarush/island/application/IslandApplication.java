package ru.javarush.island.application;

import ru.javarush.island.islandMap.Cell;
import ru.javarush.island.islandMap.GameMap;
import ru.javarush.island.islandMap.Island;
import ru.javarush.island.organismes.Organism;

import java.util.*;

public class IslandApplication {

    public GameMap createIsland() {
        Island island = new Island();
        island.print("Введите длину и ширину острова");
        Scanner scanner = new Scanner(System.in);
        GameMap gameMap = new GameMap(scanner.nextInt(), scanner.nextInt());
        Organism.addAnimals();
        gameMap.addLocations();
        return gameMap;
    }

    public void animalsGo(ArrayList<Cell> listOfCells) {
        for (Cell cell : listOfCells) {
            for (Organism organism : Organism.organisms) {
                ArrayList<Organism> list = cell.residents.get(organism.getClass());
                for (int i = 0; i < list.size(); i++) {
                    int location = cell.getId();
                    list.get(i).go(organism, cell.getResidents(), location);
                }
            }
        }
    }
    public void print(String message) {
        System.out.println(message);
    }
}
