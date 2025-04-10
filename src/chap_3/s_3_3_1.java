package chap_3;

import java.util.Arrays;

public class s_3_3_1 {

    public static void main(String[] args) {
        var data1 = new int [][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    
        var data2 = new int [][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
     
        System.out.println(Arrays.equals(data1, data2));
        System.out.println(Arrays.deepEquals(data1, data2));
    

    var dat1 = new int[] {1, 3};
    var dat2 = new int[] {1, 2, 3};
    var dat3 = new int[] {1, 2, 3};
    var dat4 = new int[] {1, 3, 1};
    var dat5 = new int[] {1, 2, 3, 4};

    System.out.println(Arrays.compare(dat1, dat2));
    System.out.println(Arrays.compare(dat2, dat3));
    System.out.println(Arrays.compare(dat3, dat4));
    System.out.println(Arrays.compare(dat2, dat5));

    }


}
