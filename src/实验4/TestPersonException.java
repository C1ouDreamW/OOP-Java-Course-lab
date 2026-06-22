package 实验4;

// 3. 编写应用程序进行测试
public class TestPersonException {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            // 测试正常情况
            person.setAge(20);
            System.out.println("设置成功，当前年龄: " + person.getAge());

            // 测试异常情况
            person.setAge(-5);
            System.out.println("设置成功，当前年龄: " + person.getAge()); // 此行不会被执行
        } catch (MyException e) {
            System.out.println("捕获到异常: " + e.getMessage());
        }
    }
}