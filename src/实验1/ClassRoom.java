package 实验1;

//ClassRoom.java
public class ClassRoom {
    public static void main (String args[ ]) {
        System.out.println("教学活动从教室开始"); //【代码1】命令行窗口输出"教学活动从教室开始"
        Teacher zhang = new Teacher();
        Student jiang = new Student();
        zhang.introduceSelf();
        jiang.introduceSelf();
    }
}



