package hu.zslim.colony.ants;

import hu.zslim.colony.Position;

public class Drone extends MovingAnt {
    public Drone(Position position) {
        super(position);
    }

    @Override
    public void move() {
        position = position.makeAMove(QUEEN_POSITION);

    }

    @Override
    public void step() {
        if (position.calculateDistance(QUEEN_POSITION) > 3) {
            move();
            System.out.println("This drone is at " + position);
        } // TODO: implement mating attempt
    }

}
