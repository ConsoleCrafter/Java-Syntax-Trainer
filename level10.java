import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int drop = r.nextInt(100);
        if (drop < 50) {
            System.out.println("Du bekommst Eisen!");
        } else {
            System.out.println("Du bekommst Diamant!");
        }
    }
}
