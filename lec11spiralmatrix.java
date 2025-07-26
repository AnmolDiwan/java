import java.util.*;
public class lec11spiralmatrix {
    public static void spiralmat( int m[][]){
        int sc=0,sr=0,er=m.length-1,ec=m[0].length-1;//start coloumn and row wagera ko initialise kar rahe hai -1 kar rahe hai taki = use kar sake aur usi se logic implement hoga
        while(sr<=er&&sc<=ec){
            //top wala border
            for(int i=sc;i<=ec;i++){
                System.out.print(m[sr][i]);
            }
            for(int i=sr+1;i<=er;i++){
                System.out.print(m[i][ec]);
            }
            for(int i=ec-1;i>=sc;i--){
                System.out.print(m[er][i]);
            }
            for(int i=er-1;i>=sr+1;i--){
                System.out.print(m[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }
    public static void main(String args[]){
        int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralmat(m);
    }
}
