package ru.job4j.tracker.input;

import ru.job4j.tracker.input.Input;

public class MockInput implements Input {
    private String[] answers;
    private int position = 0;

    public MockInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
