package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("60-80 kmph");
    }

    @Override
    public void passengers(int count) {
        System.out.println("up to " + count + " passengers");
    }

    @Override
    public int refuel(int fuel) {
        int fuelCost = 50;
        int price = fuel * fuelCost;
        System.out.println(price);
        return price;
    }
}
