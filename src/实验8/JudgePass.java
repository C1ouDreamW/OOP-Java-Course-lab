package 实验8;

// JudgePass.java
public class JudgePass {
    public void doJudge(double aver) {
        System.out.println("流水线最终判断阶段开始...");
        if(aver >= 60.0) {
            System.out.println("结论：该选手成绩及格！");
        } else {
            System.out.println("结论：该选手成绩不及格！");
        }
    }
}