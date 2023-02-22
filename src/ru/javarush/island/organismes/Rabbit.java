package ru.javarush.island.organismes;

public class Rabbit extends Organism implements Herbivores, Movable, Reproducable {

    private OrganismParametres organismParametres = new OrganismParametres(2,5,2,0.45);

    public Rabbit() {
        super.organismParametres = organismParametres;
    }

    @Override
    public String toString() {
        return "Кролик";
    }
}
