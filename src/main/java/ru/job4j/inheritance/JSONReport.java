package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        String sl = "\"";
        return "{" + System.lineSeparator()
                + "\t" + sl + "name" + sl + " : "
                + sl + name + sl + "," + System.lineSeparator()
                + "\t" + sl + "body" + sl + " : "
                + sl + body + sl + System.lineSeparator()
                + "}";
    }
}
