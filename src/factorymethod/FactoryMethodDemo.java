package factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        RobotCreator cleaningCreator = new CleaningRobotCreator();
        RobotCreator securityCreator = new SecurityRobotCreator();
        RobotCreator deliveryCreator = new DeliveryRobotCreator();

        cleaningCreator.startWork();
        securityCreator.startWork();
        deliveryCreator.startWork();
    }
}