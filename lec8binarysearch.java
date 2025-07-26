import java.util.*;
/*binary search mei sorted array ek prerequisite hojata hai and it is way efficient than the normal searching method */

public class lec8binarysearch {
    public static int binarysearch(int num[],int key){
        int start=0,end=num.length-1;
        while(start<=end){//until start > end
            int mid=(int)(start+end)/2;
            if(num[mid]==key){
                return mid;//equal
            }
            if(num[mid]>key){
                end=mid-1;//right
            }
            else{
                start=mid+1;//left
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int arr[]={1,4,10,30,60,70,90};
        int index=binarysearch(arr,key);
        if(index==-1){
            System.out.println("no such key exists");
        }
        else{
            System.out.println(index);
        }
    }
}
