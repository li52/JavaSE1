package yichang;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * Created by ${李朋}
 * on 2017/4/27.
 * 编写一个程序,将Fibonacci数列的前20项写入一个随机访问文件raf.txt
 * 然后从该文件中读出第2、4、6等偶数位置上的项并将它们依次写入另一个文件output.txt
 */
public class E5 {

    private static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw")) {
            for (int i = 0; i < 20; i++) {
                raf.writeInt(fibonacci(i + 1));
            }
            raf.seek(0);
            for (int i = 0; i < 3; i++) {
                raf.readInt();
                try (RandomAccessFile file = new RandomAccessFile("output.txt", "rw")) {
                    int r = raf.readInt();
                    System.out.println(r);
                    file.writeInt(r);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
