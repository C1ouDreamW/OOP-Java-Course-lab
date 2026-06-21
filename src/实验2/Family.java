package 实验2;

// Family.java
public class Family {
    TV homeTV;
    public void buyTV(TV tv) {
        this.homeTV = tv;
        System.out.println("家庭买了一台新电视！");
    }
    public void watchTV() {
        if(homeTV != null) {
            homeTV.showProgram();
        } else {
            System.out.println("家里还没买电视呢。");
        }
    }
}