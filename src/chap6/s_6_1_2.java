package chap6;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class s_6_1_2 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<String>(List.of("バラ", "ひまわり", "あさがお"));
        for (String a : data) {
            System.out.println(a);
        }

        Iterator<String> itr = data.iterator();//String型の要素を持ったArrayListのイテレーターをつくる。イテレーター型も要素の型を指定する必要がある。
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ListIterator<String> ite2 = data.listIterator(data.size());
        while(ite2.hasPrevious()) {
            System.out.println(ite2.previous());
        }

        Iterator<String> ite = data.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
            ite.remove();
        }
        System.out.println(data);

    }

}
