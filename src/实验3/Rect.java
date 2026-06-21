package 实验3;

// Rect.java
public class Rect extends Geometry {
    double a, b;
    Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }
    // 【代码 1】重写 getArea()方法
    public double getArea() {
        return a * b;
    }
}
