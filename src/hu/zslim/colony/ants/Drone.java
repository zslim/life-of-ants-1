package hu.zslim.colony.ants;

import hu.zslim.colony.Position;

import java.util.Random;
import java.util.function.Supplier;

public class Drone extends MovingAnt {
    private int matingRoundsLeft;
    private Supplier<Boolean> queenMoodCallback;

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
//            System.out.println("This drone is at " + position);
        } else if (matingRoundsLeft > 1) {
            matingRoundsLeft --;
        } else if (matingRoundsLeft == 1) {
            matingRoundsLeft --;
            flyAway();
        } else {
            attemptToMate();
        }
    }

    public void registerCallback(Supplier<Boolean> callback) {
        this.queenMoodCallback = callback;
    }

    private void attemptToMate() {
        boolean queenIsInTheMood = queenMoodCallback.get();
        System.out.println("Drone at " + position);
        System.out.println("Let's try");
        if (queenIsInTheMood) {
            System.out.println("HALLELUJAH!");
            matingRoundsLeft = 10;
        } else {
            System.out.println("Nah...");
            flyAway();
        }
    }

    private void flyAway() {
        Random rnd = new Random();
        int x = rnd.nextInt(100);
        this.position = new Position(x, 100 - x);
        System.out.println("Flew away to " + position);
    }

}
