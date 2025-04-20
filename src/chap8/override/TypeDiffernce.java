package chap8.override;

public class TypeDiffernce {
    public static void main(String[] args) {
        Person p = new BusinessPerson();
        p.name = "山田太郎";
        p.age = 30;
        System.out.println(p.work());//Person型では、BusinessPersonクラス特有のメソッドは呼べない。子クラスのインスタンスを親クラスの型に入れられるのは、子クラスのインスタンスは親クラスの
        //要素も全て持つ、つまり包含しているから。
        System.out.println(p.show());

    }



}