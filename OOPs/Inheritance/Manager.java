package OOPs.Inheritance;

public class Manager extends Employee{

    int teamSize;

    Manager(String name, int age, String company, int teamSize){
        super(name, age, company);
        this.teamSize = teamSize;
    }

    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("Manages a team of: " + teamSize + " employees");
    }

    void conductMeeting() {
        System.out.println(name + " is conducting a team meeting with " + teamSize + " employees.");
    }

}
