package hu.zslim.colony;

import static java.lang.Math.abs;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculateDistance(Position otherPosition) {
        int distance = this.x - otherPosition.x + this.y - otherPosition.y;
        return distance;
    }

    public Position makeAMove(Direction direction) {
        switch (direction) {
            case NORTH:
                this.y ++;
                break;
            case EAST:
                this.x ++;
                break;
            case SOUTH:
                this.y --;
                break;
            case WEST:
                this.x --;
                break;
        }

        return this;
    }
    
    public Position makeAMove(Position toPosition) {
        if (abs(this.x - toPosition.x) > abs(this.y - toPosition.y)) {
            if (this.x > toPosition.x) {
                this.x --;
            } else {
                this.x ++;
            }
        } else {
            if (this.y > toPosition.y) {
                this.y --;
            } else {
                this.y ++;
            }
        }
        return this;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
