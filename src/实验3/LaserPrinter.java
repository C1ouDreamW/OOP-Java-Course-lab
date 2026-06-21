package 实验3;

class LaserPrinter extends Printer {
    LaserPrinter() {
        super("Laser Printer");
    }
    @Override
    void print(String txt) {
        System.out.println("激光打印机正在快速打印: " + txt);
    }
}