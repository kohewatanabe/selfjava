package chap8.delegation;

import java.util.Random;

public class Roulette {
    private int bound;
    private Random random = new Random();

    public Roulette(int bound) {
        this.bound = bound;
    }

    public int nextInt() {
        return this.random.nextInt(this.bound);//has-aの関係であれば継承ではなく、機能の一部だけを使う委譲を使う。継承を使うのはis-aの関係が成り立つ時。
    }
}