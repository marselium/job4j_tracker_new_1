package ru.job4j.polymorphism;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add(String str) {
        store.save(str);
    }

    public static void main(String[] args) {
        FileStore fileStore = new FileStore();
        Service service = new Service(fileStore);
        service.add("Test");
    }
}
