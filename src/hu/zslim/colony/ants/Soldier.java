package hu.zslim.colony.ants;

import hu.zslim.colony.Direction;
import hu.zslim.colony.Position;

public class Soldier extends MovingAnt {
    private Direction lastDirection = Direction.getRandomDirection();
    public Soldier(Position position) {
        super(position);
    }

    @Override
    public void move() {
        Direction nextDirection = Direction.getClockwiseNext(lastDirection);
        position = position.makeAMove(nextDirection);
    }

    @Override
    public void step() {
        move();
//        System.out.println("This soldier is at " + position);
    }
}
