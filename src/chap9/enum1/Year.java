package chap9.enum1;
//列挙型は、意味の似た定数がいくつかあって、なおかつそれらに多面的な意味(フィールドやメソッド)を持たせたい時に使うと便利(クラスで定数にするための仕組みコンストラクタを勝手にprivateにするなど
//も整っている)。
public class Year {
    public static void main(String[] args) {
        Month2 apr = Month2.Apr;
        System.out.println(apr);

        System.out.println(Month2.Jan);

        for(Month2 m : Month2.values()) {//名前の一覧を表示
            System.out.print(m + " ");
        }
        System.out.println();

        for(Month2 m : Month2.values()) {//各列挙子が持つフィールドの一覧を表示。
            System.out.print(m.days + " ");
        }
        System.out.println();
    }
}