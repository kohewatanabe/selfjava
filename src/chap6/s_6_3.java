package chap6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class s_6_3 {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<Integer>(List.of(1, 20, 30, 10, 30, 60, 15));//Setでは重複が許されない。重複した値を指定した場合、
        //重複がなくなるように重複した値は1つになるように調整される。
        Set<Integer> hs2 = new HashSet<Integer>(List.of(5, 20, 99));

        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(1));
        System.out.println(hs.containsAll(hs2));
        System.out.println(hs.remove(1));
        System.out.println(hs);

        hs.addAll(hs2);//hs2の要素のうち、hsの要素に含まれない全ての要素がhsの要素として追加される。
        System.out.println(hs);

        hs.retainAll(hs2);//二つの集合の共通要素だけが残る。
        System.out.println(hs);

        Set<Integer> hs3 = new HashSet<Integer>(List.of(1, 10, 20));
        hs.removeAll(hs3);//hsの集合からhs3の集合の要素が全部削除される。
        System.out.println(hs);

    }

}
