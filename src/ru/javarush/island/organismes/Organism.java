package ru.javarush.island.organismes;
import ru.javarush.island.islandMap.Cell;
import ru.javarush.island.islandMap.Direction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Organism {
    public static HashSet<Organism> organisms;
    public OrganismParametres organismParametres;
    public Map<Type, Integer> food;
    public static final int MIN_FOR_REPRODUCING = 2;

    public static HashSet<Organism> addAnimals() {
        organisms = new HashSet<>();
        organisms.add(new Wolf());
        organisms.add(new Boa());
        organisms.add(new Fox());
        organisms.add(new Rabbit());
        organisms.add(new Mouse());
        organisms.add(new Bear());
        organisms.add(new Boar());
        organisms.add(new Eagle());
        organisms.add(new Plant());
        organisms.add(new Buffalo());
        organisms.add(new Deer());
        organisms.add(new Duck());
        organisms.add(new Goat());
        organisms.add(new Horse());
        organisms.add(new Sheep());
        organisms.add(new Caterpillar());
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
                    if (nextCell.residents.get(organism.getClass()).size() < organism.organismParametres.getMaxAmount()) {
                        residents.get(organism.getClass()).remove(this);
                        nextCell.residents.get(organism.getClass()).add(organism);
                    }
                }
            }
        }

    public void eat(Organism organism, Map<Type, ArrayList<Organism>> residents) {
        Map<Type, Integer> food = organism.getFood();
        double limitOfFood = organism.organismParametres.getMaxWeightOfFood();
            if (food != null) {
                for (Type type : food.keySet()) {
                    if (residents.containsKey(type)) {
                        ArrayList<Organism> victims = residents.get(type);
                        if (victims.isEmpty()) break;
                        Organism victim = residents.get(type).get(0);
                        Integer probabilityToEatPercent = food.get(victim.getClass());
                        int chanceToEat = ThreadLocalRandom.current().nextInt(0, 101);
                        if (chanceToEat <=probabilityToEatPercent) {
                            double weightOfVictim = victim.organismParametres.getWeight();
                            limitOfFood -= weightOfVictim;
                            if (limitOfFood <= 0) {break;}
                            residents.get(type).remove(victim);
                        }
                    }
                }
            }
        }

        public void reproduce (Organism organism, Map < Type, ArrayList < Organism >> residents) throws Exception {
            Constructor constructor = null;
            if (residents.get(organism.getClass()).size() < organism.organismParametres.getMaxAmount() &&
                    residents.get(organism.getClass()).size() >= MIN_FOR_REPRODUCING) {
                Class clazz = (Class) organism.getClass();
                constructor = clazz.getConstructor();
                Organism newOrganism = (Organism) constructor.newInstance();
                residents.get(organism.getClass()).add(newOrganism);
            }
        }
        public Map<Type, Integer> getFood() {
            return food;
        }
    }

