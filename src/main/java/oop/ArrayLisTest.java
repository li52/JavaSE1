package oop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/11 0011.
 */
public class ArrayLisTest {
    public static void main(String[] args) {
        List<String> strings1 = new ArrayList<>();
        strings1.add("a");
        strings1.add("b");
        List<String> strings2 = new ArrayList<>();
        strings2.add("a");
        strings2.add("b");
        strings2.add("c");
// [a, c]
        System.out.println(strings1.equals(strings2));

        List<String> strings3 = new ArrayList<>(strings2.subList(1, 3));
        System.out.println(strings3);

        System.out.println(strings3.containsAll(strings1));

        strings2.removeAll(strings3);
        System.out.println(strings2);

        // retain 保留\ [rɪ'teɪn]
        strings3.retainAll(strings2); // [b, c] [a]
        System.out.println(strings3);
    }
}
