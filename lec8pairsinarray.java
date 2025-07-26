import java.util.*;
public class lec8pairsinarray {
    public static void pairs(int arr[]){
        int cusum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){ 
                System.out.print("["); 
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    cusum=cusum+arr[k];
                }
                System.out.print("]");
                System.out.print("="+cusum+" ");
                if(cusum>maxsum){
                    maxsum=cusum;
                }
                cusum=0;
            }
            System.out.println();
        }
        System.out.println("max sum of the subarrays is = "+ maxsum);
    }
    /*this is really important to understand in this question there are 3 nested loops and the first one dictates the start 
     * of the subarray the second one dictates the end of the array and the 3rd one dictates all the possible combinations 
     * and prints them one by one
     */
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pairs(arr);
    }
}
/*the time complexity is O(n^3) which is the worst case so this is not a good way to approach this better way is in lec9prefixsum */