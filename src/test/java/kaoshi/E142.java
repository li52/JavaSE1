package kaoshi;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
//编写一个正确处理的产生空指针异常的程序
public class E142 {
        public static void main(String[] args) {
            try {
                ((String) null).length();
            } catch (NullPointerException e) {
                System.out.println();
            }
        }
}
