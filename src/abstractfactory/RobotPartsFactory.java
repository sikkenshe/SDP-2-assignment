package abstractfactory;

public interface RobotPartsFactory {

    Sensor createSensor();

    Battery createBattery();
}
