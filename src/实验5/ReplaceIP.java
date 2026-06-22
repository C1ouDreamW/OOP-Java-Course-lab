package 实验5;

import java.util.regex.*;

public class ReplaceIP {
    public static void main(String args[]) {
        String str = "登录网站：222.128.89.253";
        String regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            String IP = matcher.group();
            System.out.println("原始IP: " + IP);
            String result = matcher.replaceAll("202.192.78.56");
            System.out.println("替换后的字符串: " + result);
        }
    }
}