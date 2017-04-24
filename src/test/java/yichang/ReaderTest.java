package yichang;

import java.io.*;

/**
 * Created by Administrator on 2017/4/20 0020.
 */

public class ReaderTest {//ctrl+o   重写方法
    public static void main(String[] args) {
        //Reader reader = null;
        try (Reader reader=new FileReader("test")){
            //reader = new FileReader("test");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }/* finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }

}
