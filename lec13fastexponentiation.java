import java.util.*;
public class lec13fastexponentiation {
    public static void fastexpo(int n,int expo){
        int ans=1;
        while(expo>0){
            if((expo&1)==1){
                ans=ans*n;
            }
            n*=n;
            expo=expo>>1;
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        int n=2,expo=3;
        fastexpo(2,3);
    }
}
