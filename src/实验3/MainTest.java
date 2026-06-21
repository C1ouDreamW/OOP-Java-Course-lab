package 实验3;

// MainTest.java (主测试类)
public class MainTest {
    static void askAllToEat(Person[] ps) {
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].sleep();
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "张三"; p.id = "001"; p.age = "40";

        Student s = new Student();
        s.name = "李四"; s.sno = "S2023"; s.age = "20";

        Teacher t = new Teacher();
        t.name = "王五"; t.tid = "T007"; t.age = "35";

        // 属性和方法调用测试
        s.study();
        t.tech();

        // 多态测试
        Person[] peopleArray = {p, s, t};
        System.out.println("--- 多态调用开始 ---");
        askAllToEat(peopleArray);
    }
}