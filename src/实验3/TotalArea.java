package 实验3;

// TotalArea.java
public class TotalArea {
    Geometry[] tuxing;
    double totalArea = 0;
    public void setTuxing(Geometry[] t) {
        tuxing = t;
    }
    public double computerTotalArea() {
        // 【代码 3】用循环语句让 tuxing 的元素调用 getArea 方法，并将返回的值累加到 totalArea
        for(int i = 0; i < tuxing.length; i++) {
            totalArea += tuxing[i].getArea();
        }
        return totalArea;
    }
}