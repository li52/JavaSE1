package yichang;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class Test {
    public static void main(String[] args) {//异常   例外
        try{
            System.out.println("hello".charAt(6));
            System.out.println((new int[]{1,2,3})[0]);
            System.out.println(1/1);
            System.out.println(Integer.valueOf("123"));
            String s="hi";
            //s=null；
            System.out.println(s.toUpperCase());
        }catch (IndexOutOfBoundsException e){
        }

            System.out.println("test......");
    }
}
