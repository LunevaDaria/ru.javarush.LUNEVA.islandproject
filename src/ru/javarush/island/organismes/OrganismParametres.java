package ru.javarush.island.organismes;

import java.lang.reflect.Type;
import java.util.Map;

public class OrganismParametres {
    private double weight;
    private int maxAmount;
    private int maxSpeed;
    private double maxWeightOfFood;
    private int WEIGTLOSS = 1;


    public OrganismParametres(double weight, int maxAmount, int maxSpeed, double maxWeightOfFood) {
        this.weight = weight;
        this.maxAmount = maxAmount;
        this.maxSpeed = maxSpeed;
        this.maxWeightOfFood = maxWeightOfFood;
    }

    public OrganismParametres(double weight, int maxAmount) {
        this.weight = weight;
        this.maxAmount = maxAmount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight -= WEIGTLOSS;
        System.out.println(this + "похудел");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxWeightOfFood() {
        return maxWeightOfFood;
    }

}
