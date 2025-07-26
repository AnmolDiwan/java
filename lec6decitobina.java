import java.util.*;
public class lec6decitobina {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),digi,deci=0,c;
        double i=0;
        while(n>0){
            digi=n%2;
            deci=deci+digi*(int)Math.pow(10,i);
            i++;
            n/=2;
        }
        System.out.println(deci);
    }
}
