package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Wolf extends Organism {
    private OrganismParametres organismParametres = new OrganismParametres(50,30,3,8);
    private Map<Type, Integer> food = new HashMap<>();
    {
        food.put(Horse.class, 10);
        food.put(Deer.class, 15);
        food.put(Rabbit.class, 60);
        food.put(Mouse.class, 80);
        food.put(Goat.class, 60);
        food.put(Sheep.class, 70);
        food.put(Boar.class, 15);
        food.put(Buffalo.class, 10);
        food.put(Duck.class, 40);
    }

    public Wolf(){
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC3A";
    }
}
