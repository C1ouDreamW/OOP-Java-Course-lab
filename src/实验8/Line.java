package 实验8;

public class Line {
    InputScore one;
    DelScore two;
    ComputerAver three;
    Line(){//创建流水线
        three=new ComputerAver();
        two=new DelScore(three); one=new InputScore(two);
    }
    public void givePersonScore(){ one.inputScore();//流水线任务第一步
    }
}
