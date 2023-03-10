package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Duck extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(1,200,4,0.15);

    private Map<Type, Integer> food = new HashMap<>();

    {
        food.put(Caterpillar.class, 90);
        food.put(Plant.class, 100);
    }

    public Duck() {
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "\uD83E\uDD86";
    }
}
