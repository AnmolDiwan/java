import java.util.*;
public class lec9buysellstock {
    public static void stock(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        int profit;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                profit=price[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);//this is really a good way
            }
            else{
                buyprice=price[i];
            }
        }
        System.out.println(maxprofit);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        stock(arr);
    }
}
