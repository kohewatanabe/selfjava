package chap8.mutable;

class mutableBasic {
    public static void main(String[] args) {

        int[] age = {12, 13, 14};

        Person person = new Person("山田太郎", age);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        age[0] = 15;//変数が参照型の場合インスタンス変数に代入されるのは参照型の本体が存在するヒープ領域の住所。
        //finalが修飾しているのはスタック領域のインスタンス変数に格納されている値、つまり住所なので、ヒープ領域の値は変更できてしまう。
        System.out.println(person.getAge());

    }
}