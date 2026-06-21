package 实验3;

class LetterPrinter {
    private OutputStrategy strategy;

    public void setStrategy(OutputStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePrint() {
        if (strategy != null) {
            strategy.printLetters();
        }
    }
}