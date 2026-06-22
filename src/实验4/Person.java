package 实验4;

// 2. 编写实体类 Person
class Person {
    private int age;

    public void setAge(int age) throws MyException {
        if (age <= 0) {
            // 如果 age<=0，抛出自定义异常
            throw new MyException("输入的年龄 " + age + " 无效，年龄必须大于0！");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}