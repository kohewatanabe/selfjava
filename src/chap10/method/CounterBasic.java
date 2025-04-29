package chap10.method;

public class CounterBasic {
    public static void main(String[] args) {
        String[] data = new String[] {"春はあけぼの", "夏は夜", "秋は夕暮れ"};
        MethodRefUnuse u = new MethodRefUnuse();
        Counter c = new Counter();
        u.walkArray(data, c::addLength);
        System.out.println(c.getResult());
    }
}//メソッド参照を利用することで、枠組みとなる機能(ここでは配列を順に走査する機能)だけを実装しておき、詳細な機能はメソッドの利用者が決める(より汎用性の高いメソッドを設計できるようになる)。