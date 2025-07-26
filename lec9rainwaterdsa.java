import java.util.*;
public class lec9rainwaterdsa {
    public static void rainwater(int arr[]){
        //pehle left max 
        int leftmax[]=new int[arr.length];
        int n=arr.length;
        int water=0;
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        // phir right max
        int rightmax[]=new int[arr.length];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        //phir ek loop for min of both and w-x
        for(int i=0;i<n;i++){
            water+=(Math.min(leftmax[i],rightmax[i])-arr[i]);
        }
        System.out.print(water);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rainwater(arr);
    }
}
