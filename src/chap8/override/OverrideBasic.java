package chap8.override;

public class OverrideBasic {
    public static void main(String[] args) {
        BusinessPerson bp = new BusinessPerson();

        bp.name = "山田太郎";
        bp.age = 30;

        System.out.println(bp.show());
        System.out.println(bp.work());
    }

}