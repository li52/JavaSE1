package kaoshi;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/4/15 0015.
 */
//拆分字符串，字符串中含有逗号和数字，
// 对数字排序并输出
//例如：String s0=”123,45,25,85”;
        //输出：25 45,85,123
    public class E118 {
    public static void main(String[] args) {
        String s="123,45,25,85";
        String[] str=s.split(",");
        for(int i=0;i<str.length;i++){
        }

        int[] num=new int[str.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(num);

        for(int j=0;j<num.length;j++){
            System.out.print(num[j]+" ");

        }
    }

}