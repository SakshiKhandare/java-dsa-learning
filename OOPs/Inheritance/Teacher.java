package OOPs.Inheritance;

public class Teacher extends Person{
    String subject;

    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("Subject: " + subject);
    }

    void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}
