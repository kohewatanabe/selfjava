package chap_7;

public class s_7_1_p {
    static void main(String[] args) {
        s_7_1 p1 = new s_7_1();
        p1.name = "山田太郎";
        p1.age = 30;

        s_7_1 p2 = new s_7_1();
        p2.name = "鈴木花子";
        p2.age = 25;
        System.out.printf("%s (%d) \n", p1.name, p1.age);
        System.out.printf("%s (%d) \n", p2.name, p2.age);
    }
}
