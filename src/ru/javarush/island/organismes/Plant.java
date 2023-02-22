package ru.javarush.island.organismes;

public class Plant extends Organism {

    private OrganismParametres organismParametres = new OrganismParametres(1,200);

    public Plant() {
        super.organismParametres = organismParametres;
    }

    @Override
    public String toString() {
        return "Растения";
    }

// Но нам нужно практически поработать с многопоточностью,
    // поэтому обязательно нужно использовать потоки и пулы потоков.
    // Один scheduled пул — для запуска по расписанию задания роста растений,
}
