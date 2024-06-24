public class Main {
    public static void main(String[] args) {
        // AbstractFactory abs = new AbstractFactory();
        VehicleFactory vehicleFactory1 = AbstractFactory.getVehicleFactory("Bajaj");

        Car car = vehicleFactory1.createCar();
        car.drive();

        Bike bike = vehicleFactory1.createBike();
        bike.drive();

        VehicleFactory vehicleFactory2 = AbstractFactory.getVehicleFactory("BMW");
        Car car2 = vehicleFactory2.createCar();
        car2.drive();

        Bike bike2 = vehicleFactory2.createBike();
        bike2.drive();


    }
}
