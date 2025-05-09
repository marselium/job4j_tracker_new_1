package ru.job4j.tracker.output;

public class StubOutput implements Output {
    private final StringBuilder builder = new StringBuilder();

    @Override
    public void println(Object object) {
        if (object != null) {
            builder.append(object.toString());
        } else {
            builder.append("null");
        }
        builder.append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
