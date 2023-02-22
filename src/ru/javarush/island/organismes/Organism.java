package ru.javarush.island.organismes;
import ru.javarush.island.islandMap.Cell;
import ru.javarush.island.islandMap.Direction;

import java.lang.reflect.Type;
import java.util.*;

public abstract class Organism {
    public static HashSet<Organism> organisms;
    public OrganismParametres organismParametres;

    public static HashSet<Organism> addAnimals() {
        organisms = new HashSet<>();
        organisms.add(new Wolf());
        organisms.add(new Rabbit());
//        organisms.add(new Plant());
//        organisms.add(new Boa());
        return organisms;
    }
    public ArrayList<Organism> settle(Organism organism) {
        ArrayList<Organism> settlers = new ArrayList<>();
        int amount = (int) (Math.random() * organism.organismParametres.getMaxAmount());
        for (int i = 0; i < amount; i++) {
            settlers.add(organism);
        }
        return settlers;
    }

    public void go(Organism organism, Map<Type, ArrayList<Organism>> residents, int location) {
            Direction direction = Direction.getDirection();
            Map<Direction, Cell> nextCells = Cell.NEXT_CELLS.get(location);
            for (Direction possibleDirection : nextCells.keySet()) {
                if (possibleDirection.equals(direction)) {
                    Cell nextCell = nextCells.get(possibleDirection);
                    int nextLocation = nextCell.getId();
                    if (location != nextLocation && nextCell.residents.get(organism.getClass()).size() < organism.organismParametres.getMaxAmount()) {
                        System.out.println(organism + " из клетки " + location + " идёт в клетку " + nextLocation + ".");
                        residents.get(organism.getClass()).remove(organism);
                        if (nextCell.residents.containsKey(organism.getClass())) {
                            nextCell.residents.get(organism.getClass()).add(organism);
                        } else {
                            ArrayList<Organism> newResidents = new ArrayList<>();
                            newResidents.add(organism);
                            nextCell.residents.put(organism.getClass(), newResidents);
                        }
                    }
                }
            }
        }

    public void eat(Organism organism) {
    }
}

