package reflect;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;


/**
 * Created by ${李朋}
 * on 2017/5/9.
 */
public class Spider {
    public static void main(String[] args) throws IOException {
        String url = "http://bj.lianjia.com/ershoufang/dongcheng/";
        Document document = Jsoup.connect(url).cookie("lianjia_uuid","b5a4dee2-45b4-4898-96c4-b293efed3b41").get();
        Elements elements = document.select("li[class=clear]");
        System.out.println(elements.size());
        for (Element element : elements) {
            String region = element.select("a[data-el=region]").first().text();
            String totalPrice = element.select("div[class=totalPrice]").first().text();
            //System.out.println("小区"+region+";总价"+totalPrice);

            Element houseInfoElement = element.select("div[class=houseInfo]").first();
            String houseInfo = "";
            for (Node node : houseInfoElement.childNodes()) {
                if (node instanceof TextNode) {
                    houseInfo = node.toString();
                }
            }
            System.out.println("小区：" + region + "；详情：" + houseInfo + "；总价：" + totalPrice);
        }
    }

}
