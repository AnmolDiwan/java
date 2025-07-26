public class lec11sortedmatsearch {
    public static boolean spiralmat( int m[][],int key){
        int row=0,col=m[0].length-1;
        while(row<m.length&&col>=0){
            if(m[row][col]==key){
                System.out.println(row +" "+ col);
                return true;
            }
            else if(key>m[row][col]){
                row++;
            }
            else if(key<m[row][col]){
                col--;
            }
        }
        System.out.println("no such key exists");
        return false;
    }
    public static void main(String args[]){
        int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=9;
        spiralmat(m,9);
    }
}
