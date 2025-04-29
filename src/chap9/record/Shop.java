package chap9.record;

public class Shop {
    public static void main(String[] args) {
        Item a = new Item("burger", 100);

        System.out.println(a);

        System.out.println(a.name());//getterを呼び出してprivateフィールドにアクセス。
        System.out.println(a.price());
    }
}