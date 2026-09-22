package factorymethod;

public class SecurityRobotCreator extends RobotCreator {

    @Override
    public Robot createRobot() {
        return new SecurityRobot();
    }
}