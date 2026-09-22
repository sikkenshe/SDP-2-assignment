package abstractfactory;

public class OutdoorBattery implements Battery {

    @Override
    public void charge() {
        System.out.println("Charging outdoor battery");
    }
}
