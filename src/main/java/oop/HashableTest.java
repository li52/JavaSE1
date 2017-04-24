package oop;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public class HashableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String>hashtable=new Hashtable<>();// K - key 键 V - value 值  K -> V
        hashtable.put(1,"a");
        hashtable.put(100,"hi");     //哈希表里面不会有相同的键  键和值不能为空
        hashtable.put(2,"hello");
        hashtable.put(2,"test");
        hashtable.put(200,"test");

        hashtable.remove(100);
        hashtable.clear();
        System.out.println(hashtable.size());//输出键的个数
        System.out.println(hashtable.get(100));//输出后面的值


        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer+"->"+hashtable.get(integer));
        }

        for (String s : hashtable.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey()+"->"+integerStringEntry.getKey());
        }

        System.out.println(hashtable.toString());
        System.out.println(hashtable.containsValue("hi"));
        System.out.println(hashtable.containsKey(2));
        System.out.println(hashtable.contains("test"));



    }


}
