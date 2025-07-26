import java.util.*;
public class lec1input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name of the circle");
        String c=sc.nextLine();
        System.out.print("enter the radius: ");
        int rad=sc.nextInt();
        double d;
        d=rad*rad*3.14;
        System.out.println("the area of circle anmolis");
        System.out.println(d);
    }
}
