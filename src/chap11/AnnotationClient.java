package chap11;

@ClassInfo(version = "2.1", description = "アノテーションの動作テスト")
public class AnnotationClient {
    public static void main(String[] args) throws ClassNotFoundException {
        var clazz = AnnotationClient.class;//AnnotationCleientクラスのクラスオブジェクト(メソッド、フィールド、アノテーションなどに関する情報を持ったオブジェクト)を取得。コンパイル時に生成されて
        //実行時にJVMによってロードされてメタ空間に配置される.classファイルクラスの設計図そのもの。
        var info = clazz.getAnnotation(ClassInfo.class);//getAnnotationメソッドでクラス情報の中に付随したアノテーション情報を取得する。アノテーションのクラスオブジェクトを引数に取る。
        System.out.println("バージョン" + (info.value().equals("") ? info.version() : info.value()));
        System.out.println("説明" + info.description());
    }
}