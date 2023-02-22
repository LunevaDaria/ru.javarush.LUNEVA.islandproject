package ru.javarush.island.organismes;

public class Wolf extends Organism implements Predator, Movable, Reproducable {
    private OrganismParametres organismParametres = new OrganismParametres(50,5,3,8);

    public Wolf() {
        super.organismParametres = organismParametres;
    }

    @Override
    public String toString() {
        return "Волк";
    }
}
