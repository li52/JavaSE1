package kaoshi;

/**
 * Created by ${李朋}
 * on 2017/5/6.
 */
public class E162 {
    public static void main(String[] args){
        E162 e162 = new E162() ;
        System.out.println(e162.ss("s1","s2")) ;
        System.out.println(e162.ss("s1")) ;
    }
    public String ss(String s1,String s2){
        return s1+s2 ;
    }
    public String ss(String s1){
        return s1 ;
    }
}
