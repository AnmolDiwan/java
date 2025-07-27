public class lec14copconc {
    public static void main(String args[]){
        Student s1=new Student("anmol diwan","Anmol Diwan","dihhhhhh");
        Student s2=new Student(s1);
        s2.getter();
        s1.id="ASSSSSS";
        s2.getter();
    }
}
class Student{
    String id;
    String name;
    String password;
    Student(Student s1){
        this.id=s1.id;
        this.name=s1.name;
        this.password=s1.password;
    }
    Student(String id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }
    void getter(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(password);
    }
}
