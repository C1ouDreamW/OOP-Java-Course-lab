package 实验1;//BaggageAndMony.java
import java.util.Scanner;
public class BaggageAndMony {
    public static void main(String args[]) {
        int trainCharge=12;  //火车托运计费:每公斤12元
        int carCharge=22;    //汽车托运计费:每公斤22元
        double planeCharge = 0.062 ;//飞机托运计费:每克0.062元
        Scanner reader=new Scanner(System.in);
        double weight,charge;
        System.out.printf("输入行李重量:");
        weight = reader.nextDouble();
        System.out.printf("行李重量:%f公斤(kg)\n",weight);

        System.out.printf("需要计费的重量:%d(kg)\n",(int)weight);
        charge = (int)(weight*trainCharge); //【代码1】将表达式的赋值给charge
        System.out.printf("用火车托运(%d元/kg),费用:%f元\n",trainCharge,charge);

        System.out.printf("需要计费的重量:%d(kg)\n",(int)(weight+0.5));
        charge = (int)(weight*carCharge + 0.5); //【代码2】四舍五入后赋值给charge
        System.out.printf("用汽车托运(%d元/kg),费用:%f元\n",carCharge,charge);

        System.out.printf("需要计费的重量:%d(g)\n",(int)(weight*1000+0.5));
        charge = (int)(weight*1000*planeCharge + 0.5); //【代码3】转换为克并四舍五入赋值给charge
        System.out.printf("用飞机托运(%f元/g),费用:%f元\n", planeCharge,charge);
    }
}