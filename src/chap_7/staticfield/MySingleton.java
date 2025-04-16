package chap_7.staticfield;

public class MySingleton {
    private static MySingleton instance = new MySingleton();

    private String setting;

    private MySingleton() {};

    public static MySingleton getInstance() {
        return instance;
    }

    public String getSetting() {
        return this.setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }
}