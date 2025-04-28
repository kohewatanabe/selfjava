package chap9.throw1;

public class User2 {
    private String name, password;

    public User2(String name, String password) {
        if(name.isEmpty()) {
            throw new RuntimeException("the name is empty");
        }
        if(password.isEmpty()) {
            throw new RuntimeException("the password is empty");
        }
        this.name = name;
        this.password = password;
    }
    
    public void print() {
        System.out.println("name:" + name + "password:" + password);
    }
}