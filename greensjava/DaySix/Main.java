package greensjava.DaySix;

class Loops {
    // Renamed the method to follow camelCase
    public void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    // Renamed the method and fixed the placement
    public void doWhileLoop() {
        int i = 11;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

}

public class Main {
    public void For(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }
    public static void main(String[] args) {

        Loops loop = new Loops();
        System.out.println(" WHile loop");

        loop.whileLoop();
        System.out.println(" Do-WHile loop");
        loop.doWhileLoop();

        Main main = new Main();
        System.out.println(" For-Loops");
        main.For();

    }
}
