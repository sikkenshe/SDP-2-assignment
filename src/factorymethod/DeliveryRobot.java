package factorymethod;

public class DeliveryRobot implements Robot {

    @Override
    public void performTask() {
        System.out.println("Delivering a package");
    }
}