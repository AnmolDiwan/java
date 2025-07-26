import java.util.Scanner;

public class lec7hollowrhombus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if (i>=2&&i<=(n-1)) {
                    if(j>=2&&j<n){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }/*hollow rectangle wala logic bhi laga sakte hai more efficient and less confusing */
    }
}
