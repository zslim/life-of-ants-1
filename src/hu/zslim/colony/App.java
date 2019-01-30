package hu.zslim.colony;

public class App {

    public static void main(String[] args) {
        System.out.println("Program running");
        Colony colony = new Colony();
        System.out.println("Colony alive");

        for (int i = 0; i < 500; i++) {
            colony.step();
        }
    }
}
