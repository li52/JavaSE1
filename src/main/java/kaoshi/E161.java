package kaoshi;
import java.io.*;

/**
 * Created by ${李朋}
 * on 2017/5/6.
 */
public class E161 {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int i, k;
        i = Integer.parseInt(br.readLine());
        if(i>100 || i<0){
            System.out.println("输入成绩有误");
           System.exit(1);
        }
        k=i/10;
        switch(k){
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }

    }
}
