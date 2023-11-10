package org.example;

public enum Instruction {
    LEFT('L'),
    RIGHT('R'),
    FORWARD('M');

    private final char value;

    Instruction(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
