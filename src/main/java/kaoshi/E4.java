package kaoshi;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
//将如下两个数组中重复的元素存入一个新的数组
public class E4 {
    public static void main(String[] args) {
        String InitProducts[] = {"89","90","77","87","66","54","328","890","99"};
        String deleteProducts[] = {"65","72","12","77","2","96","54","27","89"};
        String newProducts[] = new String[InitProducts.length - deleteProducts.length];
        int count = 0;
        for(int i=0;i<InitProducts.length;i++){
            boolean flag = true;
            String temp = InitProducts[i];
            for(int j=0;j<deleteProducts.length;j++){
                if(temp.equals(deleteProducts[j])){
                    flag = false;
                    break;
                }
            }
            if(flag){
                newProducts[count++] = temp;
            }
        }
        System.out.println(Arrays.toString(newProducts));
    }

}
