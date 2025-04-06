package chap_2;

public class s_2_4 {
    public static void main(String[] args) {
        int i = 13;
        byte b = (byte)i;
        long m = 10;
        int n = (int)m;
        //mはlong型で定義されている変数なので、int型に変換するのは縮小変換であり、変換する際は明示的な変換を行う必要がある。


        System.out.println(b);
        System.out.println(n);
    }

}
