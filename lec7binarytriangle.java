import java.util.*;
public class lec7binarytriangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(t%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
                t++;
            }
            System.out.println();
        }
    }
}
