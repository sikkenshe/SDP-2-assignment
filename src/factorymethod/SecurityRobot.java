package factorymethod;

public class SecurityRobot implements Robot {

    @Override
    public void performTask() {
        System.out.println("Protecting the building");
    }
}