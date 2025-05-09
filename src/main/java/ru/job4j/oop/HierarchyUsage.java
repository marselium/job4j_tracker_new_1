package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        CarTransport car = new CarTransport();
        Transport transport = car;
        Object obj = car;
        Object objCar = new CarTransport();
        CarTransport carFromObj = (CarTransport) objCar;
    }
}
