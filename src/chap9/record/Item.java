package chap9.record;

public record Item(String name, int price) {
    
    public void print() {
        System.out.printf("%-7s %d yen\n", this.name, this.price);
    }
}