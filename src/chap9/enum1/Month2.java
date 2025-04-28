package chap9.enum1;

public enum Month2 {
    Jan(31), Feb(28), Mar(31), Apr(30), May(31), Jun(30), 
    Jul(31), Aug(31), Sep(30), Oct(31), Nov(30), Dec(31);

    public final int days;

    private Month2(int days) {
        this.days = days;
    }
}