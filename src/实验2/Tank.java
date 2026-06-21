package 实验2;

// Tank.java
public class Tank {
    double speed;             //【代码 1】声明 double 型变量 speed,刻画速度
    int bulletAmount;         //【代码 2】声明 int 型变量 bulletAmount,刻画炮弹数量

    void speedUp(int s) {
        speed = speed + s;    //【代码 3】将 s+speed 赋值给 speed
    }

    void speedDown(int d) {
        if(speed - d >= 0)
            speed = speed - d; //【代码 4】将 speed-d 赋值给 speed
        else
            speed = 0;
    }

    void setBulletAmount(int m) {
        bulletAmount = m;
    }

    int getBulletAmount() {
        return bulletAmount;
    }

    double getSpeed() {
        return speed;
    }

    void fire() {
        if(bulletAmount >= 1){
            bulletAmount = bulletAmount - 1; //【代码 5】将 bulletAmount-1 赋值给 bulletAmount
            System.out.println("打出一发炮弹");
        }
        else {
            System.out.println("没有炮弹了,无法开火");
        }
    }
}
