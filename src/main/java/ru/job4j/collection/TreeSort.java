package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
        Set<Integer> integers = new HashSet<>();
        integers.add(5);
        integers.add(1);
        integers.add(3);
        System.out.println(integers);
    }
}