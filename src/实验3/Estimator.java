package 实验3;
// Estimator.java (主类)
public class Estimator {
    public static void main(String args[]) {
        double a[] = {9.89, 9.88, 9.99, 9.12, 9.69, 9.76, 8.97};
        double b[] = {56, 55.5, 65, 50, 51.5, 53.6, 70, 49, 66, 62, 46};
        CompurerAverage computer;

        computer = new SongGame();
        // 【代码 2】computer 调用 average(double x[])方法，将数组 a 传递给参数 x
        double result = computer.average(a);
        System.out.printf("%n");
        System.out.printf("歌手最后得分:%5.3f\n", result);

        computer = new School();
        // 【代码 3】computer 调用 average(double x[])方法，将数组 b 传递给参数 x
        result = computer.average(b);
        System.out.printf("学生平均体重:%-5.2f kg", result);
    }
}