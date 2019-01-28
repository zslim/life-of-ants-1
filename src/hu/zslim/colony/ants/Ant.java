package hu.zslim.colony.ants;

import hu.zslim.colony.Position;

public abstract class Ant {

    public static Position queenPosition = new Position(0, 0);
    protected Position position;

    public Ant(Position position) {
        this.position = position;
    }

    public abstract void step();
}
