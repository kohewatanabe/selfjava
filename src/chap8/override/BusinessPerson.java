package chap8.override;

class BusinessPerson extends Person {
    public BusinessPerson() {}

    @Override
    public String show() {
        return String.format("会社員の%s (%d歳)です。", this.name, this.age);

    }

    public String work() {
        return String.format("%d歳の%sは、働きます。", this.age, this.name);
    }
    
}
