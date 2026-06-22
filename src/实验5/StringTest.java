package 实验5;

public class StringTest {
    public static void main(String args[]) {
        String s = "Hello, Java Programming!";
        // 获取字符串长度
        System.out.println("长度: " + s.length());
        // 查找字符
        System.out.println("J第一次出现的位置: " + s.indexOf('J'));
        // 截取子串
        String sub = s.substring(7, 11);
        System.out.println("截取的子串: " + sub);
        // 类型转换：String转int
        String numStr = "12345";
        int num = Integer.parseInt(numStr);
        System.out.println("转换后的数字: " + num);
    }
}