package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Rabbit extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(2,150,2,0.45);

    private Map<Type, Integer> food = new HashMap<>();
    {food.put(Plant.class, 100);}

    public Rabbit() {
        super.organismParametres = organismParametres;
        this.food = food;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC07";
    }
}
