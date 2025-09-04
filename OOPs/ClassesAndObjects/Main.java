package OOPs.ClassesAndObjects;

public class Main {

    public static void main(String[] args) {
        // - classes = blueprint for objects
        // - objects = instance of a class

        // class = data + methods
        // data = variables (fields)
        // methods = functions

        Car c1 = new Car();
        Car c2 = new Car();

        System.out.println(c1.make);
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.year);
        System.out.println(c1.price);

        c1.drive();
        c1.brake();

        System.out.println(c2.make);
        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.year);
        System.out.println(c2.price);
    }
}
