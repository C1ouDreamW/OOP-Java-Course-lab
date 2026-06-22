package 实验5;

import java.util.Calendar;
public class DateTest {
    public static void main(String args[]) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 月份从0开始
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("当前日期: " + year + "年" + month + "月" + day + "日");

        // 简单计算：一年后的日期
        calendar.add(Calendar.YEAR, 1);
        System.out.println("一年后的今天: " + calendar.get(Calendar.YEAR) + "年");
    }
}
