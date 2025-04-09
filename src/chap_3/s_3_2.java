package chap_3;

public class s_3_2 {
    public static void main(String[] args) {

        var x = 1;
        var y = x;
        x += 10;
        System.out.println(x);
        System.out.println(y);

        var builder1 = new StringBuilder("あいう");
        var builder2 = builder1;

        builder1.append("えお");

        System.out.println(builder1);
        System.out.println(builder2);

        final int[] VALUES = {10, 20, 30};

        VALUES[0] = 100;

        System.out.println(VALUES);
    
    }
}
