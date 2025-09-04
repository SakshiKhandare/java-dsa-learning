package OOPs.Inheritance;

public class Student extends Person{

    String college;

    Student(String name, int age, String college){
        super(name, age);
        this.college = college;
    }

    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("College: " + college);
    }

    void study(){
        System.out.println(name + " is studying at " + college);
    }
}
