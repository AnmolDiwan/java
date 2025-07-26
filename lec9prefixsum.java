import java.util.*;
public class lec9prefixsum {
    public static void prefixsumway(int arr[]){
        int cusum=0,maxsum=Integer.MIN_VALUE;
        int prefixsum[]=new int[arr.length];
        for(int i=0;i<prefixsum.length;i++){
            prefixsum[i]= i==0? arr[i]:prefixsum[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){ 
                cusum= i==0? prefixsum[j]:prefixsum[j]-prefixsum[i-1];
                if(cusum>maxsum){
                    maxsum=cusum;
                }
                System.out.println(cusum);
                cusum=0;
            }
            System.out.println();
        }
        System.out.println("max sum of the subarrays is = "+ maxsum);
    }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        prefixsumway(arr);
    }
}/*this is genius because it uses math and logic to improve tc significantly from O(n^3) to O(n^2) 
this is an important code for the logic*/
