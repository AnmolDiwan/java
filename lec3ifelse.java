import java.util.*;
public class lec3ifelse {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int tax,income;
        income=sc.nextInt();
        if(income<500000){
            tax=0;
        }
        else if(income>=500000&&income<1000000){
            tax=(int)(income*(0.2));
        }
        else{
            tax=(int)(income*(0.3));
        }
        System.out.println("the tax would be "+(tax)+"\nthe new income would be "+(income-tax));
    }
}
