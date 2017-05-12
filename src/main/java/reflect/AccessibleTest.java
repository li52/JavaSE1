package reflect;

import java.lang.reflect.Field;

/**
 * Created by ${李朋}
 * on 2017/5/4.
 */
public class AccessibleTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Person person=new Person();
        Field age=Class.forName("reflect.Person").getDeclaredField("age");
        age.setAccessible(true);
        age.setInt(person,age.getInt(person)+1);
        System.out.println(age.getInt(person));

    }
}


