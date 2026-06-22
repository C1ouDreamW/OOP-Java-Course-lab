package 实验5;

import java.util.Random;
public class MathRandomTest {
    public static void main(String args[]) {
        // 使用Math类
        double power = Math.pow(2, 3); // 2的3次方
        System.out.println("2的3次方: " + power);

        // 使用Random类生成1-100的随机数
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        System.out.println("随机生成的数字: " + randomNum);
    }
}
