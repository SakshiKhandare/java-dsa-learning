package OOPs.Abstraction;

// Abstract parent class
abstract class Vehicle {

    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }

    // Abstract method (must be implemented by child classes)
    abstract void start();

    abstract void fuelType();

    // Concrete method (common to all vehicles)
    void showBrand(){
        System.out.println("Brand: " + brand);
    }
}
