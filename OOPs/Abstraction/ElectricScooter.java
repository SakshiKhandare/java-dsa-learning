package OOPs.Abstraction;

public class ElectricScooter extends Vehicle{


    ElectricScooter(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " Electric Scooter starts silently with a button.");
    }

    @Override
    void fuelType() {
        System.out.println(brand + " Electric Scooter uses Battery.");
    }

    void chargeBattery() {
        System.out.println("Charging the battery of " + brand + " Electric Scooter.");
    }
}
