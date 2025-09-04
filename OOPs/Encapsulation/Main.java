package OOPs.Encapsulation;

public class Main {

    public static void main(String[] args) {
        // Creating student object using constructor
        Student s1 = new Student("Amit", 20);
        Student s2 = new Student("Riya", -3); // invalid age handled in constructor

        // Accessing values using getters
        System.out.println("Student 1: " + s1.getName() + " - Age: " + s1.getAge());
        System.out.println("Student 2: " + s2.getName() + " - Age: " + s2.getAge());

        // Updating values using setters
        s1.setAge(25);
        s2.setName("Priya");

        System.out.println("\n--- After Updates ---");
        System.out.println("Student 1: " + s1.getName() + " - Age: " + s1.getAge());
        System.out.println("Student 2: " + s2.getName() + " - Age: " + s2.getAge());

        // Trying invalid update
        s1.setAge(-10);
    }
}
