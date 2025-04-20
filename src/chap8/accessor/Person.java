package chap8.accessor;

class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalArgumentException("年齢は正数で指定してください。");//メソッド経由で変更させることで、あり得ない値に対する例外処理を加えることが出来る。
        }
        this.age = age;
    }

    public String show() {
        return String.format("%s (%d歳)です。", this.name, this.age);
    }
}