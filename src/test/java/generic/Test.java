package generic;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class Test<T> {
    //generic   泛型
    //general    一般
    public static void main(String[] args) {
        Test test=new Test();
        System.out.println(test.concat(1,2));
        System.out.println(test.concat(1.2,4.3));
        System.out.println(test.concat(new Date(),new Date()));


    }

    private String concat(T x, T y) {
        return String.valueOf(y).concat(String.valueOf(x));

    }
}
