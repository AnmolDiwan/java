import java.util.*;
public class lec13noof1 {
    public static int noofbits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        int n=16;
        int y=noofbits(n);
        System.out.println(y);
    }
}
