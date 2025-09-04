package OOPs.Constructors;

public class Student extends Person{

    int age;

    // 1. No-argument constructor (calls parameterized constructor using this())
    Student(){
        this("Default Name", 18);       // Constructor chaining
        System.out.println("No-arg constructor called");
    }


    // 2. Parameterized constructor (calls parent constructor using super())
    Student(String name, int age){
        super(name);                // Call parent constructor
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    // 3. Copy constructor
    Student(Student s){
        super(s.name);          // Call parent constructor
        this.age = s.age;
        System.out.println("Copy constructor called");
    }

    void show(){
        System.out.println(name + " - " + age);
    }
}
