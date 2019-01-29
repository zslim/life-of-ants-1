package hu.zslim.colony.ants;

import hu.zslim.colony.Position;

public abstract class MovingAnt extends Ant {


    public MovingAnt(Position position) {
        super(position);
    }

    public abstract void move();


}
