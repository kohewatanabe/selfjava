package chap5;

import java.io.Serializable;


public class s_5_5_3 implements Serializable {
    private static final long serialVersionUID = 1L;
    public String title;
    public String url;
    public transient boolean expired;

    public s_5_5_3(String title, String url, boolean expired) {
        this.title = title;
        this.url = url;
        this.expired = expired;
    }
}
