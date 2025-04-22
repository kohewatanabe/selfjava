package chap8.delegation;

public class RouletteMain {
    public static void main(String[] args) {
        Roulette roulette = new Roulette(3);
        System.out.println(roulette.nextInt());
    }
}