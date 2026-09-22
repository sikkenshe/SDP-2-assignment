package abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        RobotPartsFactory indoorFactory = new IndoorPartsFactory();

        RobotWorkshopClient client = new RobotWorkshopClient(indoorFactory);

        client.buildRobot();
    }
}