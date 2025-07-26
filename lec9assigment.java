import java.util.*;
public class lec9assigment {
    public static int repetition(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>0){
                    return count;
                }
            }
        }
        return -1;
        //this is a code with tc of o(N^2)
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(repetition(arr)>0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
