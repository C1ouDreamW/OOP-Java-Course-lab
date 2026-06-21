package 实验3;

// AmericanPeople.java
public class AmericanPeople extends People {
    // 【代码 2】重写 public void speakHello()方法
    public void speakHello() {
        System.out.println("How do you do");
    }
    // 【代码 3】重写 public void averageHeight()方法
    public void averageHeight() {
        height = 176;
        System.out.println("American's average height:" + height + " cm");
    }
    public void averageWeight() {
        weight = 75;
        System.out.println("American's average weight:" + weight + " kg");
    }
    public void americanBoxing() {
        System.out.println("直拳、钩拳、组合拳");
    }
}