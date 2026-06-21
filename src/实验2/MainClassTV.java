package 实验2;


// MainClass.java
public class MainClassTV {
    public static void main(String[] args) {
        TV haierTV = new TV();
        haierTV.setBrand("海尔");

        Family zhangSanFamily = new Family();
        // 将 haierTV 的引用传递给 zhangSanFamily 对象的成员变量 homeTV
        zhangSanFamily.buyTV(haierTV);
        zhangSanFamily.watchTV();
    }
}