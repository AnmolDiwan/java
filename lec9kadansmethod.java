import java.util.*;
public class lec9kadansmethod {
    public static void kadanssum(int arr[]){
        int currsum=0,maxsum=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<arr.length;i++){
            currsum= currsum<0? currsum=0:arr[i]+currsum;
            if(currsum>maxsum){
                maxsum=currsum;
                j=j+1;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        kadanssum(arr);
    }
}
/*this is just soooo better thn the previous methods the time complexity is also really less O(n) fucking love this */