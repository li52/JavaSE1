package yichang;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {                                                  //直接写test也可以  是绝对路径
             inputStream=new FileInputStream("d:test.txt");//相对路径
            //System.out.println(inputStream.read());  //输出第一个字符
            int i;
            while ((i=inputStream.read())!=-1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();//guanbi
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
