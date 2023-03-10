package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Horse extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(400,20,4,60);

    private Map<Type, Integer> food = new HashMap<>();
    {food.put(Plant.class, 100);}

    public Horse() {
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC0E";
    }
}
