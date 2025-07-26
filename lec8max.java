import java.util.*;
public class lec8max {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int marks[]={1,2,3,4,5,69,99,5};
        int largest=marks[0];
        for(int i=0;i<marks.length;i++){
            if(largest<marks[i]){
                largest=marks[i];
            }
        }
        System.out.println(largest);
    }
}
