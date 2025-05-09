package ru.job4j.polymorphism;

public class MemoryStore implements Store {
    private String[] memoryStore = new String[100];
    private int size = 0;

    public void save(String data) {
        memoryStore[size++] = data;
    }

    public String read() {
        StringBuilder builder = new StringBuilder();
        for (String store: memoryStore) {
            builder.append(store);
        }
        return builder.toString();
    }
}
