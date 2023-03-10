package ru.javarush.island.application;

import ru.javarush.island.islandMap.Cell;
import ru.javarush.island.islandMap.GameMap;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Main {
    public static ArrayList<Cell> listOfCells;
    public static void main(String[] args) {

        IslandApplication islandApplication = new IslandApplication();
        GameMap gameMap = islandApplication.createIsland();
        listOfCells = gameMap.createListOfCells();
        gameMap.setNextCells();

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);
        executorService.scheduleAtFixedRate(islandApplication, 0, 1, TimeUnit.SECONDS);
    }
}
