package kaoshi;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
public class E112 {
    public static void main(String[] args) {
        int ints[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int n[]=new int[ints.length];
        int k=0;
        for(int i=0;i<ints.length;i++){
            if(ints[i]!=0){
                n[k]=ints[i];
                System.out.print(n[k]+"\t");
                k++;
            }

        }
    }
}
