import java.util.*;
public class lec6functions {
    public static int factorial (int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r=sc.nextInt();
        double ncr;
        ncr=(double)factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(ncr);
    }
}
