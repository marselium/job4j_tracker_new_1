package ru.job4j.oop;

public class Tamagotchi {

    private int weight = 100;

    public void feed() {
        this.weight += 10;
    }

    public String info() {
        return "Current weight is: " + this.weight;
    }

    public static void feedPet(Tamagotchi petCopy) {
        petCopy.feed();
    }

    public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi();
        System.out.println(pet.info());
        feedPet(pet);
        System.out.println(pet.info());
    }
}