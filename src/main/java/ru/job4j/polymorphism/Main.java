package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("common car");
        Vehicle townCar = new TownCar();
        townCar.changeGear();
        townCar.accelerate();
        townCar.steer();
        townCar.brake();
        townCar.refill();
        Vehicle.getDragCoefficient();
        System.out.println("Sport car:");
        Vehicle sportCar = new SportCar();
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        sportCar.refill();
        Vehicle.getDragCoefficient();
    }
}
