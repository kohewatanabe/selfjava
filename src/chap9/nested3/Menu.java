package chap9.nested3;

public class Menu {

    public class Item {
        private String name;
        private int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public void print() {
            System.out.printf("%-7s %d yen\n", name, price);
        }
    }

    private Item[] item = {//静的クラスと同一クラス内であれば、外側のクラス.静的クラスのようにしないで、ただ静的クラスとして呼べる。静的クラスは外側のクラスの静的メンバ(メタ空間に保存されているメンバ)
        //にのみアクセスできる。
        new Item("burger", 100),
        new Item("potato", 150),
        new Item("skake", 120)
    };

    public void print() {
        for(Item i : item) {
            i.print();
        }
    }
}