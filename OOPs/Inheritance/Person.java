package OOPs.Inheritance;

public class Person {

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void showDetails(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void greet(){
        System.out.println("Hello, I am " + name);
    }
}
