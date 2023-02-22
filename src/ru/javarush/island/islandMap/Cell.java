package ru.javarush.island.islandMap;

import ru.javarush.island.organismes.Organism;
import java.lang.reflect.Type;
import java.util.*;

public class Cell {
    public volatile Map<Type, ArrayList<Organism>> residents;
    private int id;
    public static final Map<Integer, Map<Direction, Cell>> NEXT_CELLS = new HashMap<>();


    public Cell(Map<Type, ArrayList<Organism>> residents, int id) {
        this.residents = residents;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public Map<Type, ArrayList<Organism>> getResidents() {
        return residents;
    }

    @Override
    public String toString() {
        return "Клетка " + id +
                ", Резиденты: " + residents + "\n";
    }
}

