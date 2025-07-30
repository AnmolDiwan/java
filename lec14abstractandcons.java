public class lec14abstractandcons {
    public static void main(String args[]){
        Engine a=new Engine();
    }
}
abstract class Company{
    Company(){
        System.out.println("company cons called");
    }
}
class Car extends Company{
    Car(){
        System.out.println("car cons called");
    }
}
class Engine extends Car{
    Engine(){
        System.out.println("engine cons called");
    }
}
