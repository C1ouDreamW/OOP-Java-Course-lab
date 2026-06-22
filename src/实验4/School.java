package 实验4;

//School.java
public class School {
    String schoolName;
    InnerNewsPaper newsPaper; // 【代码1】内部类声明对象 newsPaper

    School() {
        this("某某大学");
    }

    School(String s) {
        newsPaper = new InnerNewsPaper(); // 【代码2】创建对象 newsPaper
        String [] content = {"学校举办迎新会.","机械系获得机器人大赛冠军.",
                "计算机学院召开学生会换届大会."};
        schoolName = s;
        newsPaper.setContent(content);
    }

    public void showNews() {
        newsPaper.showContent();
    }

    class InnerNewsPaper {
        String [] content;
        String paperName = "校新闻周报";

        void setContent(String []s) {
            content = s;
        }

        public void showContent() {
            System.out.println(schoolName);
            for(int i=0;i<content.length;i++) {
                System.out.println(content[i]);
            }
        }
    }
}

