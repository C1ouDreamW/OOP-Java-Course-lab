package 实验8;

// GameEngine.java
public class GameEngine implements Runnable {
    int targetNumber, guessNumber;
    boolean isTargetSet = false;
    boolean hasGuessed = false;
    boolean isGameOver = false;

    Thread hostThread, player1Thread, player2Thread;

    GameEngine() {
        hostThread = new Thread(this, "主持人");
        player1Thread = new Thread(this, "玩家A");
        player2Thread = new Thread(this, "玩家B");
    }

    public void run() {
        while (!isGameOver) {
            playRound();
        }
    }

    public synchronized void playRound() {
        Thread current = Thread.currentThread();

        // 主持人给出数字
        if (current == hostThread) {
            if (!isTargetSet) {
                targetNumber = (int)(Math.random() * 100) + 1;
                System.out.println("【" + current.getName() + "】已生成一个1到100的数字，开始猜吧！");
                isTargetSet = true;
                notifyAll();
            } else if (hasGuessed && !isGameOver) {
                if (guessNumber == targetNumber) {
                    System.out.println("【" + current.getName() + "】回答：恭喜猜对了！");
                    isGameOver = true;
                } else if (guessNumber > targetNumber) {
                    System.out.println("【" + current.getName() + "】回答：猜大了！");
                } else {
                    System.out.println("【" + current.getName() + "】回答：猜小了！");
                }
                hasGuessed = false;
                notifyAll();
            } else {
                try { wait(); } catch (InterruptedException e) {}
            }
        }
        // 玩家线程
        else if (current == player1Thread || current == player2Thread) {
            if (isTargetSet && !hasGuessed && !isGameOver) {
                guessNumber = (int)(Math.random() * 100) + 1; // 模拟简单随机猜数
                System.out.println("【" + current.getName() + "】猜：是 " + guessNumber + " 吗？");
                hasGuessed = true;
                notifyAll();
            } else {
                try { wait(); } catch (InterruptedException e) {}
            }
        }
    }
}