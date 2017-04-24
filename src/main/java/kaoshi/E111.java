package kaoshi;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
public class E111 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个整数：");
        String string = scanner.nextInt() + "";
        String[] strings = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            strings[i] = string.charAt(i) + "";
        }
        int i1 = 0;
        for (int i = 0; i < strings.length; i++) {
            i1 = i1 + Integer.parseInt(strings[i]);
        }
        System.out.println(i1);
    }
}


