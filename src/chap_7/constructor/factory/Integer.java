package chap_7.constructor.factory;

public class Integer {

    private Integer(int i){
        
    }

    public static Integer valuOf(int i) {
        if(i >= IntegerCache.low && IntegerCache.high) {
            return IntegerCache.cache[i + (-IntegerCache.low)];
        }
        return new Integer(i);//コンストラクタはリターンを返せないので引数を基に生成したインスタンスしか返せないが、ファクトリがあることで、引数の値によって
        //インスタンス以外にも様々な値を返すことが出来る。
    }

}
