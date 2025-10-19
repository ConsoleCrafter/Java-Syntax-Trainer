class Spieler {
    String name;
    int level;
}

public class Main {
    public static void main(String[] args) {
        Spieler s = new Spieler();
        s.name = "MHF_Jukebox";
        s.level = 10;
        System.out.println(s.name + " ist Level " + s.level);
    }
}
