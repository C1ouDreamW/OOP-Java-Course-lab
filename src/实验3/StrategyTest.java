package 实验3;

public class StrategyTest {
    public static void main(String[] args) {
        LetterPrinter context = new LetterPrinter();

        context.setStrategy(new LowerCaseStrategy());
        context.executePrint();

        context.setStrategy(new UpperCaseStrategy());
        context.executePrint();
    }
}