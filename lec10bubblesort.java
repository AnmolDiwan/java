import java.util.Scanner;

public class lec10bubblesort {
    public static void bubblesort(int arr[]){    
        int temp;
        for(int i=0;i<arr.length;i++){
            int noofswaps=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    noofswaps++;
                }
            }
            if(noofswaps==0){
                System.out.println(noofswaps);
                break;
            }
        } 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }       
    }
    public static void selectionsort(int arr[]){
        //select the minimum from the array and transfer it to the start
        
        for(int i=0;i<arr.length;i++){
            int min=i;//min = i because har itiration mei start different hoga and voh start starting of the array se 
            //ek ek karke shift hoga because start mei chote number aate jayenge
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }  
    }
    public static void countingsort(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        /*for(int i=0;i<count.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    count[i]++;
                }
            }
        }
        this is really fucking ineffficient nigga
        */
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j=0;//initialise j out of the loop,the value wont reset 
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;//i goes through the count loop, j 
                count[i]--;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        } 
    }
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];//protects the value of prev+1 so later it can be changed 
            int prev=i-1;
            //determination of position where we have to swap
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //swapping complete
            arr[prev+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            } 
    }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        countingsort(arr);
    }
}
