package 实验8;

public class TV implements Comparable<TV> {
    int price;
    String name;

    public TV(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int compareTo(TV b) {
        return this.price - b.price; // 按价格升序排列
    }
}