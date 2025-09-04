package OOPs.Polymorphism;

//Compile-time Polymorphism → Method Overloading
//Runtime Polymorphism → Method Overriding

// ----------------- Compile-time Polymorphism -----------------
class MathOperation {
    // Method overloading: same method name, different parameters

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// ----------------- Runtime Polymorphism -----------------
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}


public class Main {
    public static void main(String[] args) {

        // --------- Compile-time Polymorphism (Overloading) ---------
        System.out.println("--- Compile-time Polymorphism ---");
        MathOperation math = new MathOperation();
        System.out.println("add(5, 10) = " + math.add(5, 10));
        System.out.println("add(2.5, 3.5) = " + math.add(2.5, 3.5));
        System.out.println("add(1, 2, 3) = " + math.add(1, 2, 3));

        // --------- Runtime Polymorphism (Overriding) ---------
        System.out.println("\n--- Runtime Polymorphism ---");
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        // Dynamic method dispatch → which method runs depends on object type
        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
        a3.sound(); // Cow moos

        // Using array of Animals (power of polymorphism)
        System.out.println("\n--- Polymorphism with Array ---");
        Animal[] animals = { new Dog(), new Cat(), new Cow() };
        for (Animal a : animals) {
            a.sound(); // each object calls its own overridden version
        }
    }
}

