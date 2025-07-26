import java.util.*;
public class lec4patterns {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,digit,sum=0;
        while(temp>0){
            digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        System.out.print("the sum of all the digits is s"+(sum));
    }
}
