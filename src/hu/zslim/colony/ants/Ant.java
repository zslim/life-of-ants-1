package hu.zslim.colony.ants;

import hu.zslim.colony.Position;

public abstract class Ant {

    public static final Position QUEEN_POSITION = new Position(0, 0);
    protected Position position;

    public Ant(Position position) {
        this.position = position;
    }

    public abstract void step();
}
