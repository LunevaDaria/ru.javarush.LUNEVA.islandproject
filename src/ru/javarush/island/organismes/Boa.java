package ru.javarush.island.organismes;

public class Boa extends Organism implements Predator, Movable, Reproducable {
    private OrganismParametres organismParametres = new OrganismParametres(15,30,1,3);

    public Boa() {
        super.organismParametres = organismParametres;
    }

    @Override
    public String toString() {
        return "Удав";
    }
}
