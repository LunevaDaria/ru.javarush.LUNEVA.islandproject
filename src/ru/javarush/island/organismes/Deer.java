package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Deer extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(300,20,4,50);

    private Map<Type, Integer> food = new HashMap<>();
    {food.put(Plant.class, 100);}

    public Deer() {
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "\uD83E\uDD8C";
    }
}

