public class lec14interfaces {
    public static void main(String args[]){
    Queen a=new Queen();
    a.moves();
    Rook r=new Rook();
    r.moves();
    Bishop b=new Bishop();
    b.moves();
    }
}
interface ChessPieces {
    void moves();
}
class Queen implements ChessPieces{
    public void moves(){
        System.out.println("every direction untill the end of the board or anm obstacle");
    }
}
class Rook implements ChessPieces{
    public void moves(){
        System.out.println("only north south east west");
    }
}
class Bishop implements ChessPieces{
    public void moves(){
        System.out.println("only diagonally");//we must implement the method in each subclasses
    }
}
