package chap_7.argument;

public class ArgsParamsBasic {
    public static void main(String[] args) {
        ArgsParams v = new ArgsParams();
        System.out.println(v.totalProducts(12, 15, -1));
        System.out.println(v.totalProducts(5, 7, 8, 2, 4, 3));
        
    }
}