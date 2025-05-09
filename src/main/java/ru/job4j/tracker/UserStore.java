package ru.job4j.tracker;

public class UserStore {
    public static void main(String[] args) {
        User user1 = new User(1, "root", "root");
        String greeting = "Hello " + user1;
        System.out.println(user1);
        System.out.println(greeting);
    }
}
