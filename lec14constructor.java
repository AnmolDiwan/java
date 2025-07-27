public class lec14constructor {
    public static void main(String args[]){
        Student s1=new Student("Anmol Diwan",536);
    }
}

class Student {
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
        System.out.println("constructor was called>>>>>");
        System.out.println(name+" "+rollno);
    }
}
