package kaoshi;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String>strings=new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        ListIterator<String>listIterator=strings.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            //System.out.println(listIterator.nextIndex());
            System.out.println(next);
            listIterator.set("f");
            listIterator.remove();
        }
        System.out.println(strings);
        System.out.println("------");
        while (listIterator.hasNext()) {
            String next = listIterator.previous();
           // ///if (prev.equals("c")) {

            //}



        }

    }
}
