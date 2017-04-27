package yichang;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public class ChekedExceptionTest {
    public static void main(String[] args) {
        System.out.println("test......");
        test();
    }
    private static void test() {
        //抽取方法  ctrl+alt+m
        System.out.println("input a file name;");
        Scanner scanner=new Scanner(System.in);
        String fileName=scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile=new RandomAccessFile(fileName,"r");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            //System.err.println("file not found!");  //快捷键serr
            System.out.println("file not found!");
            test();//递归  recursive
        }
    }
}
