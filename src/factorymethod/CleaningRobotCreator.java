package factorymethod;

public class CleaningRobotCreator extends RobotCreator {

    @Override
    public Robot createRobot() {
        return new CleaningRobot();
    }
}