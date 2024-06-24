public class Main{
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("1500cc", "Automatic")
                .airbags(true)
                .gps(true)
                .sunroof(false)
                .build();
        System.out.println(car);
    }
}