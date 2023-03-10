package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Fox extends Organism {
        private OrganismParametres organismParametres = new OrganismParametres(8,30,2,2);
        private Map<Type, Integer> food = new HashMap<>();
        {
            food.put(Rabbit.class, 70);
            food.put(Mouse.class, 90);
            food.put(Duck.class, 60);
            food.put(Caterpillar.class, 40);
        }

    public Fox() {
        super.organismParametres = organismParametres;
        this.food = food;
    }
    @Override
    public Map<Type, Integer> getFood() {
        return food;
    }
    @Override
        public String toString() {
            return "\uD83E\uDD8A";
        }
    }
