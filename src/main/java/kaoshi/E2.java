package kaoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
//从键盘上输入一个字符串，利用字符串类的方法将大写字母转变为小写字母，
//     小写字母转变为大写字母，再将前后字符对换,然后输出最后结果。
/*public class E2 {
    public static void main(String args[])  {
        Scanner scanner=new scaner(System.in);
        //InputStreamReader isr= new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(isr);
        
        StringBuffer strb = null;
        try {
            strb = new StringBuffer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i;
        for(i=0; i<strb.length(); i++){
            char ch = strb.charAt(i);
            if(ch<='Z' && ch>='A')
                strb.setCharAt(i,(char)(ch+32));
            if(ch<='z' && ch>='a')
                strb.setCharAt(i,(char)(ch-32));
        }
        strb.reverse();
        System.out.println(strb);
    }


}*/

