package yichang;

import java.io.File;

/**
 * Created by ${李朋}
 * on 2017/4/24.
 */
public class FileTest {
    public static void main(String[] args) {
        File file=new File("raf" );
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

    }
}
