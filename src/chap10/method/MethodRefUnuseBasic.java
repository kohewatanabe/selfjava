package chap10.method;

public class MethodRefUnuseBasic {
    public static void main(String[] args) {
        String[] data = new String[] {"春はあけぼの", "夏は夜", "秋は夕暮れ"};
        MethodRefUnuse u = new MethodRefUnuse();
        u.walkArray(data, MethodRefUnuse::addQuote);
    }
}