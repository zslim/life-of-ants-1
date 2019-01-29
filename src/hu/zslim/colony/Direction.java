package hu.zslim.colony;

import java.util.Random;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    private static Random rnd = new Random();

    public static Direction getRandomDirection() {
        return values()[rnd.nextInt(values().length)];
    }
    
    public static Direction getClockwiseNext(Direction lastDirection) {
        switch (lastDirection) {
            case NORTH:
                return EAST;
            case EAST:
                return SOUTH;
            case SOUTH:
                return WEST;
            case WEST:
                return NORTH;
        }
        throw new RuntimeException("Last direction not defined");
    }
}
