package factorymethod;

public abstract class RobotCreator {

    public abstract Robot createRobot();

    public void startWork() {
        Robot robot = createRobot();
        robot.performTask();
    }
}