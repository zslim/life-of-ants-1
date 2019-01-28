package hu.zslim.colony;

import hu.zslim.colony.ants.Ant;
import hu.zslim.colony.ants.Queen;

public class Colony {

    private Ant queen = new Queen(Ant.queenPosition);

    public static void main(String[] args) {
        System.out.println("Colony alive");
    }
}
