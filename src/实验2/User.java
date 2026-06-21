package 实验2;
// User.java
public class User {
    public static void main(String args[]) {
        CD dataCD = new CD();
        int b[] = {1, 2, 3, 4, 5, 6, 7, 8};
        dataCD.setSize(b.length);
        dataCD.setContent(b);
        int a[] = dataCD.getContent();
        System.out.println("dataCD 上的内容: ");
        for(int i=0; i<a.length; i++)
            System.out.printf("%3d", a[i]);

        Computer computerIMB = new Computer();
        computerIMB.putCD(dataCD);       //【代码 1】computerIMB 调用 putCD(CD cd)方法,将 dataCD 的引用传递给 cd

        System.out.println("\n 将 dataCD 的数据复制到计算机: computerIMB.");
        computerIMB.copyToComputer();    //【代码 2】computerIMB 调用 copyToComputer()方法

        System.out.println("computerIMB 上的内容: ");
        computerIMB.showData();

        int m=12;
        System.out.println("\n computerIMB 将每个数据增加" + m);
        computerIMB.addData(m);

        System.out.println("computerIMB 将增值后的数据复制到 CD: dataCD");
        computerIMB.copyToCD();          //【代码 3】computerIMB 调用 copyToCD()方法

        System.out.println("dataCD 上的内容: ");
        a = dataCD.getContent();
        for(int i=0; i<a.length; i++)
            System.out.printf("%3d", a[i]);
    }
}