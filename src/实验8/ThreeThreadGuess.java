package 实验8;

// ThreeThreadGuess.java
public class ThreeThreadGuess {
    public static void main(String[] args) {
        GameEngine engine = new GameEngine();
        engine.hostThread.start();
        engine.player1Thread.start();
        engine.player2Thread.start();
    }
}