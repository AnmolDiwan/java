import java.util.*;
public class lec6palin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),rev=0,digi;
        int t=n;
        while(t>0){
            digi=t%10;
            rev=rev*10+digi;
            t/=10;
        }
        if(rev==n){
            System.out.println("the given number is a palindrome");
        }
        System.out.println(rev);
    }
}
