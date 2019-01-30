package hu.zslim.colony.ants;

import hu.zslim.colony.Position;

import java.util.Random;

public class Queen extends Ant {
    private boolean isInTheMood;
    private int matingRoundsLeft;
    private Random rnd = new Random();
    private int countdown;

    public Queen(Position position) {
        super(position);
        isInTheMood = rnd.nextBoolean();
        if (!isInTheMood) {
            countdown = rnd.nextInt(100) + 100;
        }
    }

    @Override
    public void step() {
        if (matingRoundsLeft > 1) {
            System.out.println(matingRoundsLeft);
            matingRoundsLeft --;
        } else if (matingRoundsLeft == 1) {
            System.out.println(matingRoundsLeft);
            matingRoundsLeft --;
            countdown = rnd.nextInt(100) + 100;
        } else if (countdown > 0) {
            System.out.println(countdown);
            countdown --;
        } else if (!isInTheMood) {
            isInTheMood = true;
        } else {
            System.out.println("I'm waiting...");
        }
    }

    public boolean handleMatingAttempt() {
        System.out.println("Drone approaching");
        if (isInTheMood) {
            matingRoundsLeft = 10;
            isInTheMood = false;
            return true;
        }
        return false;
    }
}
