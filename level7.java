class Block {
    String typ;
    int härte;

    Block(String typ, int härte) {
        this.typ = typ;
        this.härte = härte;
    }
}

public class Main {
    public static void main(String[] args) {
        Block stein = new Block("Stein", 5);
        System.out.println(stein.typ + " hat Härte " + stein.härte);
    }
}
