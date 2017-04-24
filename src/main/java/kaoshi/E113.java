package kaoshi;

import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
public class E113 {
    public static void main(String[] args) {
        //（1）声明一个String类的变量并初始化值“Hello World”。
        StringBuffer stringBuffer = new StringBuffer("hello world");
        System.out.println(stringBuffer);
        //（2）用字符串类的一个方法将上面变量的值拆分成” Hello” 和“World”两个字符串并打印输出。
        String str = "hello world";
        String[] newStr = str.split(" ");
        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);
        }
        //（3）将” Hello”这个变量转换成大写、“World”转换成 小写并打印输出。
        System.out.println("Hello".toUpperCase() + " " + "World".toLowerCase());
        //（4）声明一个String类的变量并初始化值“20100110”。
        stringBuffer = new StringBuffer("20100110");
        System.out.println(stringBuffer);
        //（5）将上面变量的值转换成2010年1月10日的形式打印输出。
        str = "hello world";
        newStr = str.split("");
        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);
        }
    }

}
