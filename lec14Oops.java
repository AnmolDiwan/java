public class lec14Oops {
    public static void main(String args[]){
        Pen p1=new Pen();
        String blue="blue";
        p1.setcolor(blue);
        
        p1.color="violet";
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
