package ru.job4j.tracker.shablon;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.List;

public class SingleTracker {

    private Tracker tracker = new Tracker();

    private static SingleTracker instance = null;

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public boolean delete(Item item) {
        return tracker.delete(item.getId());
    }

    public List<Item> findAll() {
        return tracker.findAll();
    }

    public Item findById(Item item) {
        return tracker.findById(item.getId());
    }

    public List<Item> findByName(Item item) {
        return tracker.findByName(item.getName());
    }

    public boolean replace(Item item) {
        return tracker.replace(item.getId(), item);
    }
}