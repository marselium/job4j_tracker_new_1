package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> {
            System.out.println("compare - " + left.getSize() + " : " + right.getSize());
            return Integer.compare(left.getSize(), right.getSize());
        };
        Arrays.sort(attachments, comparator);
        System.out.println(Arrays.toString(attachments));
        Comparator<Attachment> comparatorByName = (left, right) -> left.getName().compareTo(right.getName());
        Comparator<Attachment> comparatorByNameDesc = (left, right) -> right.getName().compareTo(left.getName());
        Arrays.sort(attachments, comparatorByNameDesc);
        System.out.println(Arrays.toString(attachments));
    }
}
