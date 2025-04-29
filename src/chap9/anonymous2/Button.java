package chap9.anonymous2;

public class Button {
    
    Task task;

    public Button(Task task) {
        this.task = task;
    }

    public void click() {
        this.task.run();
    }
}