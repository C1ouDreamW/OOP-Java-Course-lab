package 实验7;

import java.io.*;
import java.util.Scanner;

public class FileParser {
    public static void main(String[] args) {
        File dataFile = new File("receipt.txt");

        try {
            if (!dataFile.exists()) {
                PrintWriter initPw = new PrintWriter(new FileWriter(dataFile));
                initPw.println("Java核心技术卷一 119.5 元");
                initPw.println("罗技鼠标 89.9 元");
                initPw.println("记事本 12.0 元");
                initPw.close();
            }

            // 使用 Scanner 解析文件内容
            Scanner scanner = new Scanner(dataFile);
            double totalCost = 0.0;

            System.out.println("--- 正在解析文件: " + dataFile.getName() + " ---");

            // 遍历文件中的每一个单词/符号
            while (scanner.hasNext()) {
                String word = scanner.next();
                try {
                    // 尝试将读取到的字符串转换为 double 类型
                    double price = Double.parseDouble(word);
                    totalCost += price;
                    System.out.println("成功提取数值: " + price);
                } catch (NumberFormatException e) {
                    // 如果无法转换（比如读到的是"汉字"或"元"），则忽略异常继续往后读
                }
            }
            scanner.close();

            System.out.println("-------------------------");
            System.out.println("解析完毕！计算出的总金额为: " + totalCost + " 元");

        } catch (IOException e) {
            System.out.println("文件读取发生错误：" + e.getMessage());
        }
    }
}
