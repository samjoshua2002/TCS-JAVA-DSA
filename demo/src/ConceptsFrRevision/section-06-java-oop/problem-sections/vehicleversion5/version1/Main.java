package oop.problems.vehicleversion5.version1;

public class Main {
    public static void main(String[] args){
        Vehicle[] vehicleSaleLot = new Vehicle[4];

        vehicleSaleLot[0] = new Car(4, 25, false, 30000, 5, "Car");
        vehicleSaleLot[1] = new ElectricCar(4, 25, true, 50000, 5, "Electric Car");
        Truck truck = new Truck(4, 16, false, 45000, 3, "Truck");

        truck.setItemsCurrentlyInBed(new String[]{"Chair", "stuff"});

        // truck.viewItemsCurrentlyInBed();

        vehicleSaleLot[2] = truck;

        Motorcycle motorcycle = new Motorcycle(2, 70, true, 15000, 2, "Motorcycle");

        // motorcycle.accelerate();

        vehicleSaleLot[3] = motorcycle;

        viewVehiclesOnLot(vehicleSaleLot);
    }

    public static void viewVehiclesOnLot(Vehicle[] vehicleSaleLot) {
        System.out.println("Number of vehicles on our lot: " + vehicleSaleLot.length);

        for (int x = 0; x < vehicleSaleLot.length; x++) {
            System.out.println(vehicleSaleLot[x].getType() + " has " + vehicleSaleLot[x].getNumberOfWheels() +
                " wheels, " + "can hold " + vehicleSaleLot[x].getPassengerCount() + " passengers and can drive " +
                vehicleSaleLot[x].getMilesPerGallonOrCharge() + " miles per gallon or charge and it costs : $"
                + vehicleSaleLot[x].getCost());
        }
    }
}
