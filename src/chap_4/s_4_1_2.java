package chap_4;

public class s_4_1_2 {
    public static void main(String[] args) {
        var rank = "甲";

        if (rank.equals("甲")) {
            System.out.println("大変いいです。");
        } else if (rank.equals("乙")) {
            System.out.println("良いです。");
        } else if (rank.equals("丙")) {
            System.out.println("がんばりましょう。");
        } else {
            System.out.println("???");
        }

        switch (rank) {
            case "甲" :
             System.out.println("大変良いです。");
             break;
            case "乙" :
             System.out.println("良いです。");
             break;
            case "丙" :
             System.out.println("がんばりましょう。");
            default :
             System.out.println("???");

        }
    }

}
