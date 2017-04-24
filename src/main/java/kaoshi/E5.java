package kaoshi;


/**
 * Created by Administrator on 2017/4/1 0001.
 */
//定义一个方法，实现数组的转置输出
public class E5 {
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3,4,5,6};
        int[] a = new int[ints.length];

        int index = ints.length - 1;
        for(int i = 0; i < ints.length ; i++){
            a[i] = ints[index];
            index--;
        }

        for(int i : a){
            System.out.println(i);
        }
    }
}
