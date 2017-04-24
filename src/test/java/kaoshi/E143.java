package kaoshi;

import java.io.*;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
//编写一个程序,其功能是将两个文件的内容合并到一个文件中
//例如：1.txt 内容为 abc；2.txt 内容为 def；生成新文件3.txt 内容为 abcdef
public class E143 {
    public static void main(String args[]) throws IOException {
        File f1 = new File("d:/1.txt");
        File f2 = new File("d:/2.txt");
        File f3 = new File("d:/3.txt");
        FileInputStream fis1 = new FileInputStream(f1);
        FileInputStream fis2 = new FileInputStream(f2);
        InputStream inputStream = new SequenceInputStream(fis1, fis2);
        InputStreamReader isr = new InputStreamReader(inputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(f3, true);
        OutputStreamWriter osw = new OutputStreamWriter(fileOutputStream);
        int i;
        while((i=isr.read())!=-1){
            osw.write((char)i);
        }
        System.out.println();
    }
}
