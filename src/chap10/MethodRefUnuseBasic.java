package chap10;

public class MethodRefUnuseBasic {
    public static void main(String[] args) {
        String[] data = new String[] {"春はあけぼの", "夏は夜", "秋は夕暮れ"};
        MethodRefUnuse un = new MethodRefUnuse();
        un.walkArray(data);
    }
}