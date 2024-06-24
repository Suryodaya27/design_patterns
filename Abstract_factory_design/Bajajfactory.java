public class Bajajfactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new BajajCar();
    }
    
    @Override
    public Bike createBike() {
        return new BajajBike();
    }
}
