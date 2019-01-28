package hu.zslim.colony.ants;

import hu.zslim.colony.Position;

public abstract class MovingAnt extends Ant {

    private int distanceFromQueen;

    public MovingAnt(Position position) {
        super(position);
    }

    public abstract void move();

    public void setDistanceFromQueen() {
        this.distanceFromQueen = this.position.calculateDistance(queenPosition);
    }

}
