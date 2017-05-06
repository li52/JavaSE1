package javase.reflect;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

/**
f * on 2017/5/4.
 */
public class AccessibleTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Person person=new Person(29);
        Field age=Class.forName("javase.reflect.").getDeclaredField("age");
        age.setAccessible(true);
        System.out.println(age.get(person));
    }
}

class Person {
    private int age;
    public Person(int age) {
        this.age=age;
    }
}