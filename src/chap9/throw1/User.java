package chap9.throw1;

public class User {
    private String name, password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public void print() {
        System.out.println("name:" + name + "password:" + password);
    }
}
