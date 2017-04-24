package kaoshi;

/**
 * Created by Administrator on 2017/4/15 0015.
 */
//写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
//例如：
        //-4.5 四舍五入的结果是-4
        //4.4 四舍五入的结果是4v
public class E120 {

    public static void main(String[] args)
    {
        double data = 4.5;
        E120 test = new E120();
        System.out.println(test.round(data));
    }

    public int round(double d)
    {
        String str = Double.toString(d);
        String str1 = str.substring(str.indexOf(".") + 1,
                str.indexOf(".") + 2);
        int a = Integer.parseInt(str1);
        double data = Double.valueOf(str);
        if (a < 5)
        {
            return (int) Math.floor(data);
        }
        else
        {
            return (int) Math.ceil(data);
        }
    }

}
