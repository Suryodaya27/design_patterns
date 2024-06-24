public class AbstractFactory {
    public static VehicleFactory getVehicleFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("Bajaj")){
            return new Bajajfactory();
        }else if(factoryType.equalsIgnoreCase("BMW")){
            return new BMWFactory();
        }
        return null;
    }
}
