package ru.javarush.island.organismes;

import ru.javarush.island.islandMap.Cell;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;


public class Plant extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(1,200);

    public Plant() {
        super.organismParametres = organismParametres;
    }

    public void grow(ArrayList<Cell> listOfCells) {
        for (Cell cell : listOfCells) {
            if (cell.residents.get(Plant.class).size() < organismParametres.getMaxAmount())
                cell.residents.get(Plant.class).add(new Plant());
            }
        }

    @Override
    public void go(Organism organism, Map<Type, ArrayList<Organism>> residents, int location) {
    }

    @Override
    public void reproduce(Organism organism, Map<Type, ArrayList<Organism>> residents) throws Exception {
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "\uD83C\uDF31";
    }

// Но нам нужно практически поработать с многопоточностью,
    // поэтому обязательно нужно использовать потоки и пулы потоков.
    // Один scheduled пул — для запуска по расписанию задания роста растений,
}
