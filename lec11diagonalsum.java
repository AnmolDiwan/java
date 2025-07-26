import java.util.*;
public class lec11diagonalsum {
    public static void diagonalsum(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                if(i+j==mat.length-1){
                    sum+=mat[i][j];
                }
            }
        }//O(n^2) which is not good so use this simple trick i+j=n-1, j=n-1-i
        for(int i=0;i<mat.length;i++){
            //primary diag
            sum+=mat[i][i];
            if(i!=mat.length-1-i){
                sum+=mat[i][mat.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonalsum(m);
    }
}
