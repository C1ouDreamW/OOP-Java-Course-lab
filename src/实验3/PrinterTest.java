package 实验3;

public class PrinterTest {
    public static void main(String[] args) {
        Printer p1 = new InkPrinter();
        Printer p2 = new LaserPrinter();

        p1.showMyType();
        p1.print("实验报告3.pdf");

        p2.showMyType();
        p2.print("期末复习资料.docx");
    }
}