package chap_3;

import java.time.LocalDateTime;

public class s_3_1 {
    public static void main(String[] args) {
        System.out.println(1 + 2);
        System.out.println('a' + 1);
        System.out.println("1" + "2");
        System.out.println("a" + LocalDateTime.now());//LocalDateTime.now() = new LocalDateTime。その時の日時をオブジェクトで表すのは、部品(時、分、秒...)で分けた方が便利だから(例えば時だけ取り出すみたいな処理とか、部品ごとにアップデートできたりする)。
    }

}
