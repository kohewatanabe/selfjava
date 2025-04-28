package chap9.throw1;

public class User3 {
    private String name;
    private String password;

    public User3(String name, String password) throws Exception {
        if(name.isEmpty()) {
            throw new Exception("the name is empty");
        }

        if(password.isEmpty()) {
            throw new Exception("the password is empty");
        }

        this.name = name;
        this.password = password;
    }

    public void print() {
        System.out.println("name:" + name + "password:" + password);
    }
}