import java.util.*;
public class lec13bitmanipulation2 {
    public static boolean ispowerof2(int n){
        return (n&(n-1))==0;//property where 
    }
    public static void main(String args[]){
        int n=8;
        System.out.println(ispowerof2(n));
    }
}
