package chap9.nested4;

public class Menu {
    public void print() {
        class Item {//外側のメソッドが実行した時のみローカルクラスにアクセスできる。

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

        Item [] item = {
            new Item("burger", 100),
            new Item("potato", 150),
            new Item("shake", 120)
        };

        for(Item i : item) {
            i.print();
        }
    }
}