import java.util.*;
public class lec4reverse {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),digit;
    int temp=n;
    while(temp>0){
        digit=temp%10;
        System.out.print(digit);
        temp/=10;
    } 
    }
}
