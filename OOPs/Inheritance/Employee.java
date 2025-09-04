package OOPs.Inheritance;

public class Employee extends Person{

    String company;

    Employee(String name, int age, String company){
        super(name, age);
        this.company = company;
    }

    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("Company: " + company);
    }

    void work(){
        System.out.println(name + " is working at " + company);
    }
}
