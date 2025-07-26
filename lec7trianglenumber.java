import java.util.*;
public class lec7trianglenumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
