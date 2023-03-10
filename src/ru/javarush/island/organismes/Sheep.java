package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Sheep extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(70,140,3,15);

    private Map<Type, Integer> food = new HashMap<>();
    {food.put(Plant.class, 100);}

    public Sheep() {
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC11";
    }
}

