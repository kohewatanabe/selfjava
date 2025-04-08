package chap_3;

import java.time.LocalDateTime;

public class s_3_1 {
    public static void main(String[] args) {
        System.out.println(1 + 2);
        System.out.println('a' + 1);
        System.out.println("1" + "2");
        System.out.println("a" + LocalDateTime.now());//LocalDateTime.now() = new LocalDateTime。その時の日時をオブジェクトで表すのは、部品(時、分、秒...)で分けた方が便利だから(例えば時だけ取り出すみたいな処理とか、部品ごとにアップデートできたりする)。

        var result = "";//結合のたびに結果文字列の記憶領域を新たに確保しないといけない。速度が遅い。
        for (var i = 0; i < 10000; i++) {
            result += "いろは";
        }
        System.out.println(result);

        StringBuilder builder = new StringBuilder();//あらかじめ確保された記憶領域に、連結する文字列が追加されていく。速度が速い。
        for (var i = 0; i < 10000; i++) {
            builder.append("いろは");
        }

        String result2 = builder.toString();
        System.out.println(result2);

    }

}
