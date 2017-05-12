package RealEstate;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * Created by ${李朋}
 * on 2017/5/11.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://bj.lianjia.com/ershoufang/").cookie("lianjia_uuid", "fe547e4f-b83f-49be-9708-5af2d41ebef4").get();
        System.out.print("[");
        for (Element element : document.select("div[data-role] a[href*=ershoufang]")) {
            System.out.print("'" + element.text() + "',");
        }
        System.out.print("]");


        System.out.println("---");
        for (Element element : document.select("div[data-role] a[href*=ershoufang]")) {
            System.out.println(element.attr("href").replaceAll("(ershoufang|/)", ""));
        }
    }
}
