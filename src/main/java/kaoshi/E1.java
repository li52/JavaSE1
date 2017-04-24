package kaoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
//1. 从键盘上输入 4 行 4 列的一个实数矩阵到一个二维数组中,然后求出主对角线
//（从左上角到右下角）上元素之和以及副对角线上元素之乘积。
public class E1 {
    //private static  string;

    public static void main(String[] args) throws IOException {
        final int M = 4;
        double[][] a = new double[M][M];
        int i,j;
        double main_product=1.0,vice_product=1.0;
        //InputStreamReader isr = new InputStreamReader(System.in);  // 创建输入流对象
        //BufferedReader br=new BufferedReader(isr);
        for(i=0;i<M;i++)
            for(j=0;j<M;j++) {
                RandomAccessFile string = null;
                a[i][j] = Double.parseDouble(string.readLine());
            }
        for(i=0;i<M;i++){
            main_product *= a[i][i];  // 计算主对角线元素的乘积
             vice_product *= a[i][M-i-1]; // 计算付对角线元素的乘积
              }
        System.out.println("主对角线乘积为："+main_product);
        System.out.println("付对角线乘积为："+vice_product);
    }
}
