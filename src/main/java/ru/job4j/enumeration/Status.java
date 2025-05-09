package ru.job4j.enumeration;

public enum Status {
    ACCEPTED("OK"),
    IN_WORK("IN Work"),
    WAITING("Waiting for client"),
    FINISHED("Done");

    private final String text;

    Status(String text) {
        this.text = text;
    }

    public String info() {
        return text;
    }

    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota.info());
        System.out.println("Статус Volvo: " + volvo.info());
    }
}
