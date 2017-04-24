package yichang;
import java.io.*;

/**
 * Created by Administrator on 2017/4/21 0021.
 */
public class BufferedTest {
    public static void main(String[] args) {
        // buffer 缓冲\ ['bʌfə]
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("/Users/mingfei/Desktop/0421_Buffer.mov"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("/Users/mingfei/Desktop/new_Buffer.mov"))
        ) {
            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}