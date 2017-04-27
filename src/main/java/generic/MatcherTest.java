package generic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ${李朋}
 * on 2017/4/27.
 */
public class MatcherTest {
    public static void main(String[] args) {
        //pattern   模式
        //matcher    匹配
        Pattern pattern=Pattern.compile("l");//JS var pattern=  /j/
        Matcher matcher=pattern.matcher("hello");
        System.out.println(matcher.find());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
