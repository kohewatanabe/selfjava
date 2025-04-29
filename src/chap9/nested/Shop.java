package chap9.nested;

public class Shop {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.print();

        Item item = new Item("hotcake", 200);
        item.print();
    }
}