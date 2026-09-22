package factorymethod;

public class DeliveryRobotCreator extends RobotCreator {

    @Override
    public Robot createRobot() {
        return new DeliveryRobot();
    }
}