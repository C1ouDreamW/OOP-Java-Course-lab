package 实验3;

public class Student extends Person {
    public String sno;
    public void study() {
        System.out.println("学生 " + name + " 正在学习。");
    }
    @Override
    public void eat() {
        System.out.println("学生 " + name + " 在食堂吃营养餐。");
    }
}