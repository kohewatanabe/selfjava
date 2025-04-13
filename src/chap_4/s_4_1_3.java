package chap_4;

public class s_4_1_3 {
    public static void main(String[] args) {
        var drink = "ビール";
        System.out.println(switch(drink) {
            case "日本酒", "ビール", "ワイン" -> "醸造酒です。";

            case "ブランデー", "ウイスキー" -> "蒸留酒です";
            
            default -> "不明";
        });

        Object obj = 15;

        switch (obj) {
            case Integer i -> System.out.println(Math.abs(i));
            case String str -> System.out.println(str.substring(0,1));
            case null -> System.out.println("nullです。");

            default -> System.out.println("意図しない値です。");
        }

        switch (obj) {
            case Integer i when i >= 15 -> System.out.println("15以上の整数です。");
            case Integer i -> System.out.println("整数です。");
            case String str when str.length() < 10 -> System.out.println("長さ10未満の文字列です。");//lengthフィールドが存在するのは配列。Stringクラスではlength()メソッドしか存在しない。

            default -> System.out.println("意図しない型です。");
        }
    }

}
