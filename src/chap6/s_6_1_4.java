package chap6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class s_6_1_4 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<String>(List.of("バラ", "ひまわり", "あさがお"));
        String[] strs = new String[data.size()];//リストと同じサイズの空の配列を準備
        data.toArray(strs);//リストの中身を配列にコピー
        data.set(0, "チューリップ");
        System.out.println(data);
        System.out.println(Arrays.toString(strs));
    }

}
