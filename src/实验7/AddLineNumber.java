package 实验7;

import java.io.*;

public class AddLineNumber {
    public static void main(String[] args) {
        // 定义源文件和目标文件
        File sourceFile = new File("source.txt");
        File targetFile = new File("target.txt");

        try {
            // 贴心小设计：如果源文件不存在，先自动生成一个测试文件
            if (!sourceFile.exists()) {
                PrintWriter initPw = new PrintWriter(new FileWriter(sourceFile));
                initPw.println("这是第一行测试文本。");
                initPw.println("Java的输入输出流非常强大。");
                initPw.println("我们要给这些文字加上行号！");
                initPw.close();
                System.out.println("未找到源文件，已自动创建测试文件: " + sourceFile.getName());
            }

            // 使用缓冲流进行读写操作
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            PrintWriter writer = new PrintWriter(new FileWriter(targetFile));

            String line;
            int lineNumber = 1;

            // 逐行读取并加上行号写入目标文件
            while ((line = reader.readLine()) != null) {
                writer.println(lineNumber + ". " + line);
                lineNumber++;
            }

            // 释放资源 (非常重要)
            reader.close();
            writer.close();

            System.out.println("加行号任务完成！请在项目目录下查看 " + targetFile.getName() + " 文件。");

        } catch (IOException e) {
            System.out.println("文件读写发生错误：" + e.getMessage());
        }
    }
}
