package OOPs.Abstraction;

public class Bike extends Vehicle{


    Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " Bike starts with a self-start or kick.");
    }

    @Override
    void fuelType() {
        System.out.println(brand + " Bike uses Petrol.");
    }

    void doWheelie() {
        System.out.println(brand + " Bike is doing a wheelie!");
    }
}
