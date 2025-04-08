package chap_2;

public class s_2_5 {
    public static void main(String[] args) {
        int[] list1 = new int[5];
        int[] list2 = {1, 2, 3, 4, 5};
        String[] list3 = {
            "すずめの子 そこのけそこのけ お馬が通る",
            "目には青葉 山ホトトギス 初がつお",
            "朝顔に つるべとられて もらい水",
        };

        var list4 = new int[5];
        var list5 = new int[] {1, 2, 3, 4, 5};

        list1[0] = 15;

        int[][] list6 = new int[3][5];
        int[][] list7 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        var list8 = new int[3][];//1次元の配列で宣言しても同じなのではと思ったが、二次元の配列で宣言しないと、配列を入れ子に出来ない(配列の要素として配列を持てるデータ構造にならない)。
        list8[0] = new int[2];
        list8[1] = new int[3];
        list8[2] = new int[4];

        var list9 = new int[][] {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9},
        };
        


        System.out.println(list1[4]);
        System.out.println(list2.length);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list5);
        System.out.println(list6[0][2]);
        System.out.println(list7[0][1]);
        System.out.println(list8[0][1]);
        System.out.println(list9[0][1]);

    }

}
