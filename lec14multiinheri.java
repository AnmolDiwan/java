public class lec14multiinheri {
    public static void main(String args []){
        Mammal m=new Mammal();
        Lion l=new Lion();
        m.milk();
        l.speak();
    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void sleep(){
        System.out.println("sleeps");
    }
}
class Mammal extends Animal{
    void birth(){
        System.out.println("gets pregnant");
    }
    void milk(){
        System.out.println("Breasts");
    }
}
class Lion extends Mammal{
    void speak(){
        System.out.println("roars");
    }
}