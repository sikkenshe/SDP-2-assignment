package factorymethod;

public class CleaningRobot implements Robot {

    @Override
    public void performTask() {
        System.out.println("Cleaning the room");
    }
}