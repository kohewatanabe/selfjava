package chap9.nested2;

public class Shop {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.print();

        Menu.Item item = new Menu.Item("hotcake", 200);
        item.print();
    }
}