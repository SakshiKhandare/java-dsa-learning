package OOPs.Abstraction;

class Car extends Vehicle{

    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " Car starts with a key or button.");
    }

    @Override
    void fuelType() {
        System.out.println(brand + " Car uses Petrol/Diesel.");
    }

    void openTrunk() {
        System.out.println("Opening the trunk of " + brand + " Car.");
    }
}