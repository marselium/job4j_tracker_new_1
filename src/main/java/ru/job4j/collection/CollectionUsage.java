package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionUsage {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        for (String element : collection) {
            System.out.println(element);
        }
        System.out.println();
        System.out.println("Размер коллекции равен: " + collection.size());
        System.out.println("Коллекция содержит элемент two: " + collection.contains("two"));
        System.out.println("Содержимое в виде массива: " + Arrays.toString(collection.toArray()));
        collection.clear();
        System.out.println("Коллекция после очистки пуста: " + collection.isEmpty());
        System.out.println();
        Collection<String> list = new ArrayList<>();
        list.addAll(collection);
        list.remove("two");
        for (String element : list) {
            System.out.println(element);
        }
        Collection<String> list1 = new ArrayList<>(list);
        list1.add("four");
        Collection<String> list2 = new ArrayList<>(list);
        System.out.println("Remove all: ");
        list1.removeAll(collection);
        for (String element : list1) {
            System.out.println(element);
        }
        System.out.println("Retain all: ");
        list2.retainAll(collection);
        for (String element : list2) {
            System.out.println(element);
        }
        System.out.println();
    }
}
