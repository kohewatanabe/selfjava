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

        var drink = "ビール";//1つ1つのcase句にbreakを入れないswitch文の書き方をフォースルーという。
        switch (drink) {// switch文は()内と一致したcase句があると、breakに当たるまで、それ以降のcase句を実行する。なので、break前の複数のcase句はorのような役割を果たす。
            case "日本酒":
            case "ビール":
            case "ワイン":
             System.out.println("醸造酒です。");
             break;
            case "ブランデー":
            case "ウィスキー":
             System.out.println("蒸留酒です。");
             break;
        }

        
    }

}
