package ru.javarush.island.organismes;

public class OrganismParametres {
    private int weight;
    private int maxAmount;
    private int maxSpeed;
    private double food;

    public OrganismParametres(int weight, int maxAmount, int maxSpeed, double food) {
        this.weight = weight;
        this.maxAmount = maxAmount;
        this.maxSpeed = maxSpeed;
        this.food = food;
    }

    public OrganismParametres(int weight, int maxAmount) {
        this.weight = weight;
        this.maxAmount = maxAmount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getFood() {
        return food;
    }

}
