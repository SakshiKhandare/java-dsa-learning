package OOPs.ArrayOfObjects;

public class Student {

    String name;
    int age;
    double marks;

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void show() {
        System.out.println(name + " (Age: " + age + ", Marks: " + marks + ")");
    }
}
