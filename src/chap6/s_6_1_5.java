package chap6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class s_6_1_5 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<String>() {
            {
                add("バラ");
                add("ひまわり");
                add("あさがお");
            }
        };
        var udata = Collections.unmodifiableList(data);
        // udata.set(0, "チューリップ");
        // udata.add("さくら");

        List<StringBuilder> data2 = new ArrayList<StringBuilder>(Arrays.asList(//Arrays.asListには引数には配列や可変長の要素("あい","う","えお")が渡せる。
        //一方List.ofは引数に可変長引数しか渡せない。ただ、nullに対する挙動が前者よりいい。したがって、引数に配列を渡す時はArrays.asListで、可変長引数を渡す時はList.of。
            new StringBuilder("ひふみ"),
            new StringBuilder("よいむ"),
            new StringBuilder("なやこ")
        ));

        var udata2 = Collections.unmodifiableList(data2);
        udata2.get(0).append("いちにさん");
        System.out.println(udata2);

        List<Integer> r = new ArrayList<Integer>(List.of(Integer.valueOf(16), Integer.valueOf(24), Integer.valueOf(30), Integer.valueOf(39)));
        System.out.println(r);
        List<Integer> x = new ArrayList<Integer>(List.of(16,24,30,39));//int->Integerのオートボクシングを利用しても書ける。
    }

}
