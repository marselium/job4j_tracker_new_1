package ru.job4j.pojo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vladimir Kozhemyaka");
        student.setGroup(1122);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime dateTime = LocalDateTime.now();
        student.setDateOf(formatter.format(dateTime));
        System.out.println(student.getName() + "; " + student.getGroup() + "; " + student.getDateOf());
    }
}
