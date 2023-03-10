package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Eagle extends Organism {
    private OrganismParametres organismParametres = new OrganismParametres(6,20,3,1);
    private Map<Type, Integer> food = new HashMap<>();
    {
        food.put(Fox.class, 10);
        food.put(Rabbit.class, 90);
        food.put(Mouse.class, 90);
        food.put(Duck.class, 80);
    }

    public Eagle(){
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "\uD83E\uDD85";
    }
}
