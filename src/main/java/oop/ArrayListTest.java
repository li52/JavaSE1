package oop;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public class ArrayListTest<e> extends ArrayList {

    public static void main(String[] args) throws NoSuchFieldException,IllegalAccessException {
        List<String >strings=new ArrayList<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("test1");
        strings.add("test2");


        strings.addAll(0,strings);
        //strings.clear();
        strings.remove(0);
        //strings.remove();
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println("---");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings.contains("test1"));
        System.out.println(strings.containsAll(strings));
        System.out.println(strings.indexOf("test1"));
        System.out.println(strings.isEmpty());
        System.out.println(strings.lastIndexOf("test1"));

        ArrayListTest<Integer> integers=new ArrayListTest<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);



        integers.removeRange(1,2);
        System.out.println(integers.set(1,4));//3
        System.out.println(integers);///{1,4}


        for (Object o : integers.toArray()) {
            System.out.println(0);
        }
        System.out.println(integers.size());//2

        ///capacity
        Field field=ArrayList.class.getDeclaredField("elementData");   // reflect vi.\ 反射，映现；深思

        field.setAccessible(true);
        System.out.println("capacity1；"+ ((Object[])field.get(integers)).length);
        ///
        integers.trimToSize();
        System.out.println("capacity2:"+((Object[])field.get(integers)).length);
        System.out.println(integers.size());//2

    }
}
