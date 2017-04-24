package kaoshi;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
public class E116 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello world");
        //stringBuffer.append(" world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.delete(5, 6));// Ctrl + Q / Ctrl + J
        System.out.println(stringBuffer.insert(5, ", ")); // offset 偏移量
        System.out.println(stringBuffer.insert(stringBuffer.length(), '!')); // offset 偏移量
        System.out.println(stringBuffer.reverse()); // 逆序
        stringBuffer.reverse().setCharAt(0, 'H');
        System.out.println(stringBuffer);

        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append("hello");
        stringBuffer1.append(" world");
        System.out.println(stringBuffer1.capacity());
    }
}

