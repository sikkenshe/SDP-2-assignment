package abstractfactory;

public class IndoorSensor implements Sensor {

    @Override
    public void scan() {
        System.out.println("Scanning indoor environment");
    }
}