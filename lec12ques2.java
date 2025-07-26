import java.util.*;
public class lec12ques2 {
    public static double shortestpath(String direc){
        int x=0,y=0;
        for(int i=0;i<direc.length();i++){
            int d=direc.charAt(i);
            if(d=='w'){
                x--;
            }
            else if(d=='n'){
                y++;
            }
            else if(d=='s'){
                y--;
            }
            else if(d=='e'){
                x++;
            }
            else{
                return 3.0;
            }
        }
        double dist;
        dist=Math.sqrt(x*x+y*y);
        System.out.println(y);
        return dist;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String direc=sc.nextLine();
        double t;
        t=shortestpath(direc);
        System.out.println(t);
    }
}
