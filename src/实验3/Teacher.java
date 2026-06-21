package 实验3;

// Teacher.java
public class Teacher extends Person {
    public String tid;
    public void tech() {
        System.out.println("老师 " + name + " 正在授课。");
    }
    @Override
    public void eat() {
        System.out.println("老师 " + name + " 在教工餐厅吃饭。");
    }
}
