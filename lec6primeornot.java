import java.util.*;
public class lec6primeornot {
    public static boolean isprime(int n){
        if(n==2){
            return true;            /*only work for n>=2 bc 1 cant be classified as prime or not prime  */
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n)==true){
            System.out.println("given number is a prime number");
        }
        else{
            System.out.println("given number is not a prime number");
        }
    }
}
