package chap_4;

public class s_4_2_2 {
    public static void main(String[] args) {
        int[] data1 = new int[] {1,2,3,4,5,6,7,8,9};
        for (int i : data1) {
            for (int j : data1) {
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }
    }

}
