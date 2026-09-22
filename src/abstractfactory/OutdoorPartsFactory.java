package abstractfactory;

public class OutdoorPartsFactory implements RobotPartsFactory {

    @Override
    public Sensor createSensor() {
        return new OutdoorSensor();
    }

    @Override
    public Battery createBattery() {
        return new OutdoorBattery();
    }
}
