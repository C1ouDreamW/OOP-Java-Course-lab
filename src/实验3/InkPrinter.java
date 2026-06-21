package 实验3;

class InkPrinter extends Printer {
    InkPrinter() {
        super("Inkjet Printer");
    }
    @Override
    void print(String txt) {
        System.out.println("喷墨打印机正在打印: " + txt);
    }
}