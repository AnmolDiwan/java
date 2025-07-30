public class lec14abstractclasses {
    public static void main(String args[]){
        Wolf a=new Wolf();
        a.talk();
        a.walk();
        fish b=new fish();
        b.talk();
        b.walk();
    }
}
abstract class Animal{
    void walk(){
        System.out.println("4 legs");//this can be excessed by anyone and same for anyone
    }
    abstract void talk();//just gives an idea 
}
class Wolf extends Animal{
    void talk(){
        System.out.println("howls");// this is compulsory to define because it is a abstract function
    }
}
class fish extends Animal{
    void talk(){
        System.out.println("blub blub");
    }
}
