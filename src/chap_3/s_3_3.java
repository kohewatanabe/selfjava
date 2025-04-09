package chap_3;

public class s_3_3 {
    public static void main() {
        StringBuilder builder1 = new StringBuilder("あいう");//StringクラスとStringBUilderクラスは明確に異なる。Stringクラスは不可変文字列を生成するクラスであり、StringBuilderクラスは可変文字列を生成するクラスである。
        StringBuilder builder2 = new StringBuilder("あいう");

        System.out.println(builder1 == builder2);
        System.out.println(builder1.equals(builder2));
    }

}
