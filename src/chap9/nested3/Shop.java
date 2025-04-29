package chap9.nested3;

public class Shop {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.print();

        Menu.Item item = menu.new Item("hotcake", 200);//内部メンバクラスは外側のクラスのインスタンスメンバにもアクセスできる。そのために、
        //外側のクラスと紐づける必要があり、内部メンバクラスのインスタンスを生成する際は、外側のクラスのインスタンス.new 内部メンバクラス()として生成する。
        item.print();
    }
}