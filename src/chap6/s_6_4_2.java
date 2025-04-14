package chap6;

import java.util.Map;
import java.util.TreeMap;
import java.util.NavigableMap;

public class s_6_4_2 {
    public static void main(String[] args) {
        Map<String, String> data = new TreeMap<String, String>(Map.of("Rose", "バラ", "Sunflower", "ひまわり", "Morning Glory", "あさがお"));
        for (String key : data.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> data2 = new TreeMap<String, String>() {
            {
                put("peak", "高くなる");
                put("peach", "もも");
                put("peace", "平和");
                put("piece", "1切れ");
            }
        };
        String key2 = "pear";

        if (data2.containsKey(key2)) {
            System.out.println(key2 + "は" + data2.get(key2) + "です。");
        } else {
            System.out.println("検索中の単単語は");
            System.out.println(data2.lowerKey(key2) + "または");//指定のキーよりも小さいキーの値で、指定されたキーに近いものを提案。
            System.out.println(data2.higherKey(key2));//指定のキーよりも大きいキーの値で、指定されたキーに近いものを提案。
            System.out.println("ですか?");
        }
    }

}
