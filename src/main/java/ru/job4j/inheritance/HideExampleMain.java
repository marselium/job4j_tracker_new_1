package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.instanceInvoke();
        Animal.staticInvoke();
        cat.instanceInvoke();
        Cat.staticInvoke();
    }
}
