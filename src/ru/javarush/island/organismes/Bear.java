package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Bear extends Organism {
    private OrganismParametres organismParametres = new OrganismParametres(500,5,2,80);
    private Map<Type, Integer> food = new HashMap<>();
    {
        food.put(Boa.class, 80);
        food.put(Horse.class, 40);
        food.put(Deer.class, 80);
        food.put(Rabbit.class, 80);
        food.put(Mouse.class, 90);
        food.put(Goat.class, 70);
        food.put(Sheep.class, 70);
        food.put(Boar.class, 50);
        food.put(Buffalo.class, 20);
        food.put(Duck.class, 10);

    }
    public Bear() {
        super.organismParametres = organismParametres;
        this.food = food;
    }

    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3B";
    }
}

