package abstractfactory;

public class IndoorPartsFactory implements RobotPartsFactory {

    @Override
    public Sensor createSensor() {
        return new IndoorSensor();
    }

    @Override
    public Battery createBattery() {
        return new IndoorBattery();
    }
}
