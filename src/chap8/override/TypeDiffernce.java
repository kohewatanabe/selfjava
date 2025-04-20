package chap8.override;

public class TypeDiffernce {
    public static void main(String[] args) {
        Person p = new BusinessPerson();
        p.name = "山田太郎";
        p.age = 30;
        System.out.println(p.work());//Person型では、BusinessPersonクラス特有のメソッドは呼べない。変数の中に入っている実態はBusinessPersonインスタンスだが、実際にインスタンスからアクセスできる
        //機能(メソッドやフィールド)は格納されている変数の型が決める。すなわち、実態はBusinessPersonクラスだが、その機能はPerson型変数pによって制限されている。今回の場合だと、Personクラスの範囲
        //で定義されているメソッドやフィールドにしかアクセスできない。
        System.out.println(p.show());

    }



}