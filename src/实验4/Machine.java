package 实验4;

public class Machine {
    public void checkBag(Goods goods) throws DangerException {
        if(goods.isDanger()){
            DangerException danger = new DangerException();
            throw danger; //【代码 1】 抛出 danger 异常
        }
    }
}
