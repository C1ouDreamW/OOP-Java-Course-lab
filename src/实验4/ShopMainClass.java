package 实验4;

//MainClass.java
class MobileShop {
    InnerPurchaseMoney purchaseMoney1; // 【代码1】用内部类声明对象 purchaseMoney1
    InnerPurchaseMoney purchaseMoney2; // 【代码2】用内部类声明对象 purchaseMoney2
    private int mobileAmount; // 手机的数量

    MobileShop() {
        purchaseMoney1 = new InnerPurchaseMoney(20000); // 【代码3】创建价值为 20000 的 purchaseMoney1
        purchaseMoney2 = new InnerPurchaseMoney(10000); // 【代码4】创建价值为 10000 的 purchaseMoney2
    }

    void setMobileAmount(int m) {
        mobileAmount = m;
    }

    int getMobileAmount() {
        return mobileAmount;
    }

    class InnerPurchaseMoney {
        int moneyValue;
        InnerPurchaseMoney(int m) {
            moneyValue = m;
        }
        void buyMobile() {
            if(moneyValue >= 20000) {
                mobileAmount = mobileAmount - 6;
                System.out.println("用价值" + moneyValue + "的内部购物卷买了 6 部手机");
            } else if(moneyValue < 20000 && moneyValue >= 10000) {
                mobileAmount = mobileAmount - 3;
                System.out.println("用价值" + moneyValue + "的内部购物卷买了 3 部手机");
            }
        }
    }
}

public class ShopMainClass {
    public static void main(String args[]) {
        MobileShop shop = new MobileShop();
        shop.setMobileAmount(30);
        System.out.println("手机专卖店目前有" + shop.getMobileAmount() + "部手机");
        shop.purchaseMoney1.buyMobile();
        shop.purchaseMoney2.buyMobile();
        System.out.println("手机专卖店目前有" + shop.getMobileAmount() + "部手机");
    }
}