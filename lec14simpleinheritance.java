public class lec14simpleinheritance {
    public static void main(String args[]){
        Fish a1 = new Fish();
        a1.breathe();//the fish object can acquire the properties of the anila class but not the vice versa
    }
};
class Animal{
    void breathe(){
        System.out.println("Breathes");
    }
    void Walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
