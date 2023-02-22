package ru.javarush.island.islandMap;

public enum Direction {
    UP, DOWN, LEFT, RIGHT;

    public static final Direction[] directions = Direction.values();

    public static Direction getDirection() {
        return Direction.values()[(int) (Math.random() * (directions.length))];
    }
}
