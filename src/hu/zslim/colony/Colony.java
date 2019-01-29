package hu.zslim.colony;

import hu.zslim.colony.ants.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Colony {
    private Random rnd = new Random();
    private static final int COLONY_SIZE = 100;
    private Ant queen;
    private List<MovingAnt> workers;
    private List<MovingAnt> soldiers;
    private List<MovingAnt> drones;

    public Colony() {
        queen = new Queen(Ant.QUEEN_POSITION);
        
        List<MovingAnt> workers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Position randomPosition = new Position(rnd.nextInt(COLONY_SIZE), rnd.nextInt(COLONY_SIZE));
            workers.add(new Worker(randomPosition));
        }
        this.workers = workers;

        List<MovingAnt> soldiers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Position randomPosition = new Position(rnd.nextInt(COLONY_SIZE), rnd.nextInt(COLONY_SIZE));
            soldiers.add(new Soldier(randomPosition));
        }
        this.soldiers = soldiers;

        List<MovingAnt> drones = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Position randomPosition = new Position(rnd.nextInt(COLONY_SIZE), rnd.nextInt(COLONY_SIZE));
            drones.add(new Drone(randomPosition));
        }
        this.drones = drones;
    }
    
    public void step() {
        queen.step();

        for (Ant worker :
                workers) {
            worker.step();
        }

        for (Ant soldier :
                soldiers) {
            soldier.step();
        }

        for (Ant drone :
                drones) {
            drone.step();
        }
    }
}
