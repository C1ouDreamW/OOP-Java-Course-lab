package 实验5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CompareDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("请输入第一个日期 (如 2023-10-01): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.print("请输入第二个日期 (如 2023-10-15): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine(), formatter);

        // 判断日期大小关系
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " 晚于 " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " 早于 " + date2);
        } else {
            System.out.println("两个日期完全相同！");
        }

        // 计算日期间隔的天数
        long daysBetween = Math.abs(ChronoUnit.DAYS.between(date1, date2));
        System.out.println("这两个日期之间相隔: " + daysBetween + " 天");
    }
}
