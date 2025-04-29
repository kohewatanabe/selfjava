package chap9.nested;

public class Menu {

    private Item[] item = {
        new Item("burger", 100),
        new Item("potato", 150),
        new Item("shake", 120)
    };

    public void print() {
        for(Item i : this.item) {
            i.print();
        }
    }
}