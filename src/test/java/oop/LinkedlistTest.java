package oop;
import java.util.*;

/**
 * Created by Administrator on 2017/4/11 0011.
 */
public class LinkedlistTest {
    public static void main(String[] args) {
        LinkedList<String> strings=new LinkedList<>();
        strings.add("a");
        strings.add("b");


        System.out.println(strings.size());
        System.out.println(strings.get(0));
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());





    }

}
