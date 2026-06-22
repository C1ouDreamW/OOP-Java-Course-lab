package 实验8;

// TVTest.java
import java.util.*;

public class TVTest {
    public static void main(String[] args) {
        List<TV> list = new LinkedList<TV>();
        list.add(new TV("海尔", 3500));
        list.add(new TV("小米", 1999));
        list.add(new TV("索尼", 7999));
        list.add(new TV("创维", 2500));
        list.add(new TV("三星", 5800));

        System.out.println("----- 排序前的TV列表 -----");
        for (TV tv : list) {
            System.out.println("品牌: " + tv.name + "，价格: " + tv.price);
        }

        Collections.sort(list); // 进行排序

        System.out.println("\n----- 排序后的TV列表 -----");
        for (TV tv : list) {
            System.out.println("品牌: " + tv.name + "，价格: " + tv.price);
        }

        // 查找操作
        TV targetTV = new TV("查找目标", 2500);
        int index = Collections.binarySearch(list, targetTV, null);
        if(index >= 0) {
            System.out.println("\n在链表中找到了价格同为 " + targetTV.price + " 的电视，它是：" + list.get(index).name);
        } else {
            System.out.println("\n未找到价格相同的电视。");
        }
    }
}
