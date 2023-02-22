package ru.javarush.island.application;

import ru.javarush.island.islandMap.Cell;
import ru.javarush.island.islandMap.GameMap;
import ru.javarush.island.statistic.Statistic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        IslandApplication islandApplication = new IslandApplication();
        GameMap gameMap = islandApplication.createIsland();
        ArrayList<Cell> listOfCells = gameMap.createListOfCells();
        gameMap.setNextCells();

        Statistic.getStatisticIsland(listOfCells);
        islandApplication.print("=====================");

        islandApplication.animalsGo(listOfCells);
        islandApplication.print("=====================");

        Statistic.getStatisticIsland(listOfCells);
        islandApplication.print("=====================");

    }
}
