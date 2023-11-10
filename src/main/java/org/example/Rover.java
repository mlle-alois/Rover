package org.example;

class Rover {
    int x, y;
    char direction;

    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(char instruction) {
        if (instruction == Instruction.LEFT.getValue()) {
            turnLeft();
        } else if (instruction == Instruction.RIGHT.getValue()) {
            turnRight();
        } else if (instruction == Instruction.FORWARD.getValue()) {
            moveForward();
        }
    }

    private void turnLeft() {
        if(direction == Direction.NORTH.getValue()) {
            direction = Direction.WEST.getValue();
        } else if(direction == Direction.WEST.getValue()) {
            direction = Direction.SOUTH.getValue();
        } else if(direction == Direction.SOUTH.getValue()) {
            direction = Direction.EAST.getValue();
        } else if(direction == Direction.EAST.getValue()) {
            direction = Direction.NORTH.getValue();
        }
    }

    private void turnRight() {
        if(direction == Direction.NORTH.getValue()) {
            direction = Direction.EAST.getValue();
        } else if(direction == Direction.EAST.getValue()) {
            direction = Direction.SOUTH.getValue();
        } else if(direction == Direction.SOUTH.getValue()) {
            direction = Direction.WEST.getValue();
        } else if(direction == Direction.WEST.getValue()) {
            direction = Direction.NORTH.getValue();
        }
    }

    private void moveForward() {
        if(direction == Direction.NORTH.getValue()) {
            y++;
        } else if(direction == Direction.EAST.getValue()) {
            x++;
        } else if(direction == Direction.SOUTH.getValue()) {
            y--;
        } else if(direction == Direction.WEST.getValue()) {
            x--;
        }
    }

    public String getPosition() {
        return x + " " + y + " " + direction;
    }
}

