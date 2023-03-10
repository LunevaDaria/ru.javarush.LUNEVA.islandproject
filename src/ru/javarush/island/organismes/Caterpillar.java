package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Caterpillar extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(0.01,1000,0,0);

    private Map<Type, Integer> food = new HashMap<>();
    {food.put(Plant.class, 100);}
    public Caterpillar() {
        super.organismParametres = organismParametres;
        this.food = food;
    }

    @Override
    public void go(Organism organism, Map<Type, ArrayList<Organism>> residents, int location) {
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC1B";
    }
}
