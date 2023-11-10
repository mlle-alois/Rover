package org.example;

public enum Direction {
    NORTH('N'),
    WEST('W'),
    SOUTH('S'),
    EAST('E');

    private final char value;

    Direction(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
