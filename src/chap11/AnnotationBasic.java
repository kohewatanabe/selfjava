package chap11;

public class AnnotationBasic {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int j = 0;//SuppressWarnings("unused")アノテーションを付けることで、使用していない変数があるというコンパイラの警告を抑制できる。
        Integer i = new Integer(108);//Deprecatedアノテーションが書いてあるコードは実行できるが、非推奨。
        System.out.println(i);
    }
}