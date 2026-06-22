package 实验5;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntProcess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个大整数: ");
        BigInteger num1 = new BigInteger(scanner.nextLine());

        System.out.print("请输入第二个大整数: ");
        BigInteger num2 = new BigInteger(scanner.nextLine());

        System.out.println("两数之和: " + num1.add(num2));
        System.out.println("两数之差: " + num1.subtract(num2));
        System.out.println("两数之积: " + num1.multiply(num2));

        if (!num2.equals(BigInteger.ZERO)) {
            System.out.println("两数之商: " + num1.divide(num2));
        } else {
            System.out.println("除数不能为 0，无法计算商。");
        }

        System.out.print("请输入一个用于计算因子个数的大整数: ");
        BigInteger target = new BigInteger(scanner.nextLine());
        int factorCount = 0;

        // 遍历寻找因子 (不包括 1 和本身，因此从 2 遍历到 target 的一半)
        BigInteger half = target.divide(BigInteger.valueOf(2));
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(half) <= 0; i = i.add(BigInteger.ONE)) {
            if (target.remainder(i).equals(BigInteger.ZERO)) {
                factorCount++;
            }
        }

        System.out.println("大整数 " + target + " 的因子个数 (不含 1 和本身) 为: " + factorCount + " 个");
    }
}