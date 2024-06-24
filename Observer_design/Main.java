public class Main{
    public static void main(String[] args){
        WeatherStation w = new WeatherStation();

        Display d1 = new Display();
        Display d2 = new Display();
        Display d3 = new Display();

        w.registerObserver(d1);
        w.registerObserver(d2);
        w.registerObserver(d3);

        w.setTemperature(30);
        w.setTemperature(40);
        w.setTemperature(50);
    }
}