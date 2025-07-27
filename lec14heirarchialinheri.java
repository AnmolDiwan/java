public class lec14heirarchialinheri {
    public static void main(String args[]){
        Derived d= new Derived();
        Derived2 a=new Derived2();
        d.dfunc();
        a.dfunc2();
    }    
}
class Main{
    void mfunc(){
        System.out.println("main");
    }
}
class Derived extends Main{
    void dfunc(){
        System.out.println("dfunc1");//this object contains the functions of main and derived
    }
}
class Derived2 extends Main{
    void dfunc2(){
        System.out.println("dfunc2");//this object contains the functions of main and derived2
    }
}

