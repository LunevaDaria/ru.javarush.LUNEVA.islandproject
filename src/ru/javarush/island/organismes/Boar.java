package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Boar extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(400,50,2,50);
    private Map<Type, Integer> food = new HashMap<>();
    {
        food.put(Mouse.class, 50);
        food.put(Caterpillar.class, 90);
        food.put(Plant.class, 100);
    }

    public Boar(){
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC17";
    }
}
