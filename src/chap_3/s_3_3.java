package chap_3;

import java.math.BigDecimal;
import java.util.Arrays;

public class s_3_3 {
    public static void main() {
        StringBuilder builder1 = new StringBuilder("あいう");//StringクラスとStringBUilderクラスは明確に異なる。Stringクラスは不可変文字列を生成するクラスであり、StringBuilderクラスは可変文字列を生成するクラスである。
        StringBuilder builder2 = new StringBuilder("あいう");

        System.out.println(builder1 == builder2);
        System.out.println(builder1.equals(builder2));

        var bd1 = new BigDecimal("0.2");
        var bd2 = new BigDecimal("3");
        var bd3 = new BigDecimal("0.6");

        System.out.println(bd1.multiply(bd2).compareTo(bd3));
        
        final double EPSILON = 0.00001;
        var x = 0.2 * 3;
        var y = 0.6;

        System.out.println(Math.abs(x - y) < EPSILON);

        var data1 = new String[] {"あいうえお"};
        var data2 = new String[] {"あいうえお"};

        System.out.println(data1 == data2);
        System.out.println(data1.equals(data2));

        System.out.println(Arrays.equals(data1, data2));


    }

}
