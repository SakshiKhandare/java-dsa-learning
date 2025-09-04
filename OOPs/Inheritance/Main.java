package OOPs.Inheritance;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Rob", 18, "ABC");
        Student s1 = new Student("Kim",22,"KC College");
        Teacher t1 = new Teacher("Gigi", 30, "Maths");

        // calling parent function
        System.out.println("--- Person Greetings ---");
        e1.greet();
        s1.greet();
        t1.greet();

        System.out.println("\n--- Details with Extra Behaviors ---");
        e1.showDetails();
        e1.work();

        System.out.println();
        s1.showDetails();
        s1.study();

        System.out.println();
        t1.showDetails();
        t1.teach();

        Employee emp = new Employee("Kiran", 30, "Microsoft");
        Manager mgr = new Manager("Anjali", 40, "Microsoft", 8);

        System.out.println();
        System.out.println("--- Employee ---");
        emp.showDetails();
        emp.work();

        System.out.println();
        System.out.println("\n--- Manager ---");
        mgr.showDetails();
        mgr.work(); // inherited from Employee
        System.out.println();
        mgr.conductMeeting(); // specific to Manager

    }
}
