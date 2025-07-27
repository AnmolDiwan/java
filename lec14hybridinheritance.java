public class lec14hybridinheritance {
    
}
class Family{
    void fam(){
        System.out.println("family");
    }
}
class Mom extends Family{
    void mom(){
        System.out.println("mom");
    }
}
class Dad extends Family{
    void dad(){
        System.out.println("dad");
    }
}
class son extends Dad{
    void son(){
        System.out.println("son");
    }
}
class Daughter extends Mom{
    void daughter(){
        System.out.println("daughter");
    }
}
