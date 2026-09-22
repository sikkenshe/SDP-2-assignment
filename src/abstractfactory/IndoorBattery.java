package abstractfactory;

public class IndoorBattery implements Battery {

    @Override
    public void charge() {
        System.out.println("Charging indoor battery");
    }
}