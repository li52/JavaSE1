package kaoshi;

import java.util.Hashtable;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class HashMapTest {
    public static void main(String[] args) {
        Hashtable<Integer,String>map=new Hashtable<>();
        map.put(1,"a");
        map.put(1,"bcd");
        map.put(1000,"efgh");
        map.put(1000,"efgh");

        System.out.println(map.size());
        System.out.println(map.get(100));

        for (Integer integer : map.keySet()) {
            System.out.println(integer+">"+map.get(100));

        }
        for (String s : map.values()) {
            System.out.println(s);
        }

    }
}
