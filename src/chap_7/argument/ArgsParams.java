package chap_7.argument;

public class ArgsParams {
    public int totalProducts(int... values) {
        int result = 1;
        for (int value : values) {
            result *= value;
        }
        return result;
    }
}