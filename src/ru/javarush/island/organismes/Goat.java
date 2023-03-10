package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Goat extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(60,140,3,10);

    private Map<Type, Integer> food = new HashMap<>();
    {food.put(Plant.class, 100);}

    public Goat() {
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC10";
    }
}
