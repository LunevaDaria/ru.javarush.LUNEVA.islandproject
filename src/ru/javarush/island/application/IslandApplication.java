package ru.javarush.island.application;

import ru.javarush.island.islandMap.Cell;
import ru.javarush.island.islandMap.GameMap;
import ru.javarush.island.organismes.Organism;
import ru.javarush.island.organismes.Plant;
import ru.javarush.island.statistic.Statistic;

import java.util.*;

public class IslandApplication implements Runnable {

  private final int PROBABILITYOFREPRODUCTION = 10;
  public void run() {
          Statistic.getStatisticIsland(Main.listOfCells);
          plantsGrow(Main.listOfCells);
          animalsGo(Main.listOfCells);
          animalsEat(Main.listOfCells);
          try {
              animalsReproduce(Main.listOfCells);
          } catch (Exception e) {
              throw new RuntimeException(e);
          }
          Statistic.getStatisticIsland(Main.listOfCells);
      }
    public GameMap createIsland() {
        print("Введите длину и ширину острова");
        Scanner scanner = new Scanner(System.in);
        GameMap gameMap = new GameMap(scanner.nextInt(), scanner.nextInt());
        Organism.addAnimals();
        gameMap.addLocations();
        return gameMap;
    }
    public void plantsGrow (ArrayList<Cell> listOfCells) {
        Plant plant = new Plant();
        plant.grow(listOfCells);
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
    public void animalsEat(ArrayList<Cell> listOfCells) {
        for (Cell cell : listOfCells) {
            for (Organism organism : Organism.organisms) {
                ArrayList<Organism> list = cell.residents.get(organism.getClass());
                for (int i = 0; i < list.size(); i++) {
                    list.get(i).eat(organism, cell.getResidents());
                }
            }
        }
    }
    public void animalsReproduce(ArrayList<Cell> listOfCells) throws Exception {
        for (Cell cell : listOfCells) {
            for (Organism organism : Organism.organisms) {
                ArrayList<Organism> list = cell.residents.get(organism.getClass());
                for (int i = 0; i < list.size(); i++) {
                    if (i % PROBABILITYOFREPRODUCTION == 0) {
                        list.get(i).reproduce(organism, cell.getResidents());
                    }
                }
            }
        }
    }
    public void print(String message) {
        System.out.println(message);
    }
}
