# Robot Workshop — Design Patterns Assignment

## Project Overview

This project demonstrates two creational design patterns in Java:

* Factory Method
* Abstract Factory

The project uses a **Robot Workshop** as the main example.

The goal is to demonstrate how object creation can be separated from the code that uses the created objects.

## Part A — Factory Method

Factory Method is used to create different types of robots.

### Product

`Robot` is the common Product interface.

It defines the method:

```java
void performTask();
```

### Concrete Products

The project contains three concrete robot types:

* `CleaningRobot`
* `SecurityRobot`
* `DeliveryRobot`

Each robot implements `performTask()` differently.

### Creator

`RobotCreator` is the abstract Creator.

It defines the Factory Method:

```java
public abstract Robot createRobot();
```

It also contains the business method:

```java
public void startWork()
```

The business method works with the `Robot` abstraction and does not directly create concrete robots.

### Concrete Creators

The following classes override the Factory Method:

* `CleaningRobotCreator`
* `SecurityRobotCreator`
* `DeliveryRobotCreator`

Each Concrete Creator decides which Concrete Product to create.

## Part B — Abstract Factory

Abstract Factory is used to create compatible families of robot components.

### Abstract Products

The project defines two abstract product interfaces:

* `Sensor`
* `Battery`

### Concrete Products

Indoor family:

* `IndoorSensor`
* `IndoorBattery`

Outdoor family:

* `OutdoorSensor`
* `OutdoorBattery`

### Abstract Factory

`RobotPartsFactory` defines methods for creating both products:

```java
Sensor createSensor();
Battery createBattery();
```

### Concrete Factories

Two Concrete Factories create compatible product families:

* `IndoorPartsFactory`
* `OutdoorPartsFactory`

For example, `IndoorPartsFactory` creates:

```text
IndoorSensor
IndoorBattery
```

while `OutdoorPartsFactory` creates:

```text
OutdoorSensor
OutdoorBattery
```

### Client

`RobotWorkshopClient` receives a `RobotPartsFactory` through its constructor.

The client works only with the abstractions:

```text
RobotPartsFactory
Sensor
Battery
```

It does not directly create concrete products.

## Factory Method vs Abstract Factory

### Factory Method

Factory Method focuses on creating a product through a Creator hierarchy.

```text
Creator
   |
   +-- Concrete Creator
           |
           +-- Concrete Product
```

### Abstract Factory

Abstract Factory focuses on creating a family of related products.

```text
Abstract Factory
      |
      +-- Concrete Factory
             |
             +-- Product A
             +-- Product B
```

## Project Structure

```text
src/
├── factorymethod/
│   ├── Robot.java
│   ├── CleaningRobot.java
│   ├── SecurityRobot.java
│   ├── DeliveryRobot.java
│   ├── RobotCreator.java
│   ├── CleaningRobotCreator.java
│   ├── SecurityRobotCreator.java
│   ├── DeliveryRobotCreator.java
│   └── FactoryMethodDemo.java
│
└── abstractfactory/
    ├── Sensor.java
    ├── Battery.java
    ├── IndoorSensor.java
    ├── OutdoorSensor.java
    ├── IndoorBattery.java
    ├── OutdoorBattery.java
    ├── RobotPartsFactory.java
    ├── IndoorPartsFactory.java
    ├── OutdoorPartsFactory.java
    ├── RobotWorkshopClient.java
    └── AbstractFactoryDemo.java
```

## Running the Demos

The Factory Method example can be started from:

```text
FactoryMethodDemo
```

The Abstract Factory example can be started from:

```text
AbstractFactoryDemo
```

The examples demonstrate that the client code works through abstractions instead of directly depending on concrete products.

## Design Principles Demonstrated

The project demonstrates:

* Encapsulation of object creation
* Programming to abstractions
* Open/Closed Principle
* Single Responsibility Principle
* Inheritance in Factory Method
* Composition in Abstract Factory

## Example Outputs

Factory Method:

```text
Cleaning the room
Protecting the building
Delivering a package
```

Abstract Factory:

```text
Scanning indoor environment
Charging indoor battery
```
