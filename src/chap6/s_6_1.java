package chap6;
import java.util.List;
import java.util.ArrayList;

public class s_6_1 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        data.add("あいうえお");
        System.out.println(data.get(0));
        System.out.println(data);
        data.add("1");
        System.out.println(data);

        List<String> data1 = new ArrayList<String>() {
            {
                add("バラ");
                add("ひまわり");
                add("あさがお");
            }
        };

        System.out.println(data1);

        List data2 = List.of("バラ", "ひまわり", "あさがお");
        System.out.println(data2);
    }

}
