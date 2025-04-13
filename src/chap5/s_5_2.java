package chap5;

public class s_5_2 {
    public static void main(String[] args) {
        String str1 = "プロジェクト";
        String str2 = "𠮟る";

        System.out.println(str1.length());
        System.out.println(str2.length());

        System.out.println(str2.codePointCount(0,str2.length()));//サロゲートペアも考慮した文字列の長さを返す。

        //あとは文字列操作のための標準ライブラリ(標準で環境に備わっているクラス群)の話で、暗記するだけなので一旦飛ばす。

    }

}
