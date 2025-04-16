package chap_7.argument;

public class ArgsParams {
    public int totalProducts(int... values) {
        int result = 1;
        for (int value : values) {
            result *= value;
        }
        return result;
//可変長引数として受け取った値は配列と見なされる。
    }
}