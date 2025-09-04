package OOPs.Interfaces;

// Interface 1
interface Animal {
    void makeSound();  // abstract method
    void eat();
}

// Interface 2
interface Pet {
    void play();
}

// Class Dog implements both interfaces
class Dog implements Animal, Pet {
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
    public void eat() {
        System.out.println("Dog eats bones.");
    }
    public void play() {
        System.out.println("Dog loves playing fetch.");
    }
}

// Class Cat implements both interfaces
class Cat implements Animal, Pet {
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
    public void eat() {
        System.out.println("Cat eats fish.");
    }
    public void play() {
        System.out.println("Cat enjoys playing with yarn.");
    }
}

// Class Cow implements only Animal
class Cow implements Animal {
    public void makeSound() {
        System.out.println("Cow moos: Moo Moo!");
    }
    public void eat() {
        System.out.println("Cow eats grass.");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        Animal cow = new Cow();

        Pet p = new Dog(); // Pet reference

        d.makeSound();
        d.eat();

        c.makeSound();
        c.eat();

        cow.makeSound();
        cow.eat();

        p.play();  // Dog as a Pet
    }
}
