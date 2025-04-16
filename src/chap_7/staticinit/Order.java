package chap_7.staticinit;

public class Order {
    private String value = "First";

    public Order() {
        System.out.println(value);
    }

    {
        value = "Second";
    }
}
//インスタンスフィールドに既定値を設定→初期化ブロックの実行という順序のため。