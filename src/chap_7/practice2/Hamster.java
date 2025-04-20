package chap_7.practice2;

public class Hamster {
    private String name;
    private int age;

    public Hamster(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Hamster() {
        this.name = "権兵衛";
        this.age = 0;
    }

    public void show() {
        System.out.println(String.format("%s (%d歳)です。\n",this.name, this.age ));
    }
}