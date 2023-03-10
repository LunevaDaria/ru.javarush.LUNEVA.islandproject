package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Mouse extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(0.05,500,1,0.01);

    private Map<Type, Integer> food = new HashMap<>();
    {
        food.put(Caterpillar.class, 90);
        food.put(Plant.class, 100);
    }

    public Mouse() {
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC01";
    }
}
