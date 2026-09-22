package abstractfactory;

public class RobotWorkshopClient {

    private final RobotPartsFactory factory;

    public RobotWorkshopClient(RobotPartsFactory factory) {
        this.factory = factory;
    }

    public void buildRobot() {
        Sensor sensor = factory.createSensor();
        Battery battery = factory.createBattery();

        sensor.scan();
        battery.charge();
    }
}
