package chap8.type;

public class Person {
    public String name;
    public int age;

    public String show() {
        return String.format("%s (%d歳)です。", this.name, this.age);
    }
}