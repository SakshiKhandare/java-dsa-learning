package OOPs.Abstraction;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("Yamaha");
        Vehicle v3 = new ElectricScooter("Ola");

        System.out.println("--- Vehicle Details ---");
        v1.showBrand();
        v1.start();
        v1.fuelType();

        System.out.println();
        v2.showBrand();
        v2.start();
        v2.fuelType();

        System.out.println();
        v3.showBrand();
        v3.start();
        v3.fuelType();

        System.out.println("\n--- Child-specific methods ---");
        ((Car) v1).openTrunk();
        ((Bike) v2).doWheelie();
        ((ElectricScooter) v3).chargeBattery();
    }
}
