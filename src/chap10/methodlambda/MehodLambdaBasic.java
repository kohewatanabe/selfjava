package chap10.methodlambda;

public class MehodLambdaBasic {
    public static void main(String[] args) {
        String[] data = new String[] {"春はあけぼの", "夏は夜", "秋は夕暮れ"};
        MehodLambda ml = new MehodLambda();
        
        ml.walkArray(data, (String value) -> {//関数型インターフェイスを実装したクラスのインスタンスが動的に生成された時に、その内部メソッドとラムダ式のメソッドが紐づけられる。
            System.out.printf("[%s]\n", value);
        });
    }
} 