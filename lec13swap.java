import java.util.*;
public class lec13swap {
    public static void swap(int a,int b){
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+""+b);
    }
    public static void main(String args[]){
        int a=10,b=5;
        swap(10,5);
    }
}
