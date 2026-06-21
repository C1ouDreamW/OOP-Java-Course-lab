package 实验1;

//InputChinese.java
public class InputChinese {
    public static void main (String args[ ]) {
        char ch='研', zifu=0;
        int p=22920, count=5, position=0;
        System.out.printf("输出%d个石字旁的汉字:\n",count);
        for(char c=ch; c<=ch+count; c++) {
            position = (int)c;  //【代码1】c进行int型转换运算，并将结果赋值给position
            System.out.printf("%c(%d)",c,position);
        }
        System.out.printf("\n输出%d个女字旁的汉字:\n",count);
        for(int n=p; n<=p+count; n++) {
            zifu = (char)n;     //【代码2】n做char型转换运算，并将结果赋值给zifu
            System.out.printf("%c(%d)",zifu,n);
        }
    }
}