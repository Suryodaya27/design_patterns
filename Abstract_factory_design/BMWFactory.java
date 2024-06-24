public class BMWFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new BMWCar();
    }
    
    @Override
    public Bike createBike() {
        return new BMWBike();
    }
    
}
