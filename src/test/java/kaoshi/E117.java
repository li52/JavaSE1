package kaoshi;

/**
 * Created by Administrator on 2017/4/15 0015.
 */
//找出字符串中出现次数最多的字母和出现的次数
public class E117 {
    public static void main(String[] args) {
        String s = "adfoweyirlkbasgxalueralsdhg";
        int max = 0;
        int[] cnt = new int[127];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            max = (++cnt[c] > max) ? cnt[c] : max;
        }
        System.out.println (max);


    }

}
