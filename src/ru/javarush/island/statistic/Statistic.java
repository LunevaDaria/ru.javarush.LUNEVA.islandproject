package ru.javarush.island.statistic;

import org.w3c.dom.ls.LSOutput;
import ru.javarush.island.islandMap.Cell;
import ru.javarush.island.organismes.Organism;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public class Statistic {

    public static void getStatisticIsland (ArrayList<Cell> listOfCells) {
        for (Cell cell : listOfCells) {
            System.out.print("Клетка id = " + cell.getId() + ": ");
            Statistic.getStatisticResidents(cell.residents);
        }
        System.out.println("");
    }
    public static void getStatisticResidents(Map<Type, ArrayList<Organism>> residents) {
        int count = 0;
        for (Organism organism : Organism.organisms) {
            ArrayList<Organism> list = residents.get(organism.getClass());
            System.out.print(organism + "" + list.size() + " ");
            count+= list.size();
        }
        System.out.println("Итого = "+ count);
    }
}

//            System.out.print(organism.getClass().getSimpleName() + " = " + list.size() + ", ");

