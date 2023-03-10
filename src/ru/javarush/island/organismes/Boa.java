package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Boa extends Organism {
    private OrganismParametres organismParametres = new OrganismParametres(15,30,1,3);

    private Map<Type, Integer> food = new HashMap<>();
    {
        food.put(Fox.class, 15);
        food.put(Rabbit.class, 20);
        food.put(Mouse.class, 40);
        food.put(Duck.class, 10);
    }

    public Boa() {
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC0D";
    }
}
