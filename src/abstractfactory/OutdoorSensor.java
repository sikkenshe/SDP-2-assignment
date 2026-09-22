package abstractfactory;

public class OutdoorSensor implements Sensor {

    @Override
    public void scan() {
        System.out.println("Scanning outdoor environment");
    }
}