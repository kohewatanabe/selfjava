package chap8.construct;

public class  MyChild extends MyParent{
    public MyChild(String name) {
        //ここで親のコンストラクタに引数を渡して初期化しないといけない。親のコンストラクタが引数を持たない場合はデフォルトコンストラクタ(引数なしのコンストラクタ)が呼び出されて
        //勝手に初期化されるが、親が引数ありのコンストラクタを持つ場合は、親クラス由来のインスタンスの初期化に失敗し、エラーを吐く。
        super(name);
        System.out.printf("子の%sです。\n", name);
    }
}