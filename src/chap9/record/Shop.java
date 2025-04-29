package chap9.record;

public class Shop {
    public static void main(String[] args) {
        Item a = new Item("burger", 100);
        Item b = new Item("burger", 100);
        Item c = new Item("potato", 150);
        Item[] item = {
            new Item("burger", 100),
            new Item("potato", 150),
            new Item("shake", 120)
        };

        System.out.println(a);

        System.out.println(a.name());//getterを呼び出してprivateフィールドにアクセス。
        System.out.println(a.price());

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        for(Item i : item) {
            i.print();
        }
    }
}