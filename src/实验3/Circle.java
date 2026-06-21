package 实验3;

// Circle.java
public class Circle extends Geometry {
    double r;
    Circle(double r) {
        this.r = r;
    }
    // 【代码 2】重写 getArea()方法
    public double getArea() {
        return Math.PI * r * r;
    }
}