package exercise;

import com.sun.xml.internal.bind.v2.TODO;



/**
 * Created by Administrator on 2017/4/11 0011.
 */
public class MyLinkedList {

    private Node first;
    private Node last;
    //private int;
    public MyLinkedList() {

}


    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");

        //System.out.println(myLinkedList.first());
        //System.out.println(myLinkedList.last());
        //System.out.println(myLinkedList.get());

    }





    public boolean add(String element) {


        return true;
    }

    private class Node {
        String element;
        Node prev;
        Node next;
        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }



    }

}
