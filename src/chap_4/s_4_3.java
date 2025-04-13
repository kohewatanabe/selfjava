package chap_4;

public class s_4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for(i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 1000) {
                break;
            }
        }
        System.out.println(sum);
        System.out.println("合計が1000を超えるのは、1~"+ i +"を加算した時です");

        int sum1 = 0;

        for (int j = 0; j <= 100; j++) {
            if(j % 2 != 0) {
                continue;
            }
            sum1 += j;
        }
        System.out.println("合計値は"+sum1+"です。");

        for (int k = 1; k <= 9; k++) {
            for (int l = 1; l <= 9; l++) {
                int result = k * l;
                if (result > 50) {
                    break;
                }
                System.out.print(result + " "  );
            }
            System.out.println();
        }
    }

}
