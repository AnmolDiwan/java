import java.util.*;
public class lec6binarytodeci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,digi;
        double new1=0;
        if(n==0){
            System.out.println(new1);
        }
        while(n>0){
            digi=n%10;
            new1=new1+digi*Math.pow(2,i);
            i++;
            n/=10;
        }
        System.out.println(new1);
    }
}
