package 实验4;

// 1. 自定义异常类 MyException
class MyException extends Exception {
    public MyException(String msg) {
        super(msg); // 调用父类的构造方法
    }
}