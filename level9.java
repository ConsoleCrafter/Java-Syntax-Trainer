class Entity {
    void info() {
        System.out.println("Eine Entity existiert.");
    }
}

class Creeper extends Entity {
    void info() {
        System.out.println("💥 Creeper explodiert!");
    }
}

public class Main {
    public static void main(String[] args) {
        Entity e = new Creeper();
        e.info();
    }
}
