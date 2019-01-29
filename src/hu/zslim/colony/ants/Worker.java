package hu.zslim.colony.ants;

import hu.zslim.colony.Direction;
import hu.zslim.colony.Position;

public class Worker extends MovingAnt {
    public Worker(Position position) {
        super(position);
    }

    @Override
    public void move() {
        Direction nextDirection = Direction.getRandomDirection();
        this.position = position.makeAMove(nextDirection);
    }

    @Override
    public void step() {
        move();
        System.out.println("This worker is at " + position);
    }
}
