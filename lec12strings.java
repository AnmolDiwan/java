import java.util.*;
public class lec12strings {
    public static boolean palincheck(String name){
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt((name.length())-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        if(palincheck(name)==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
