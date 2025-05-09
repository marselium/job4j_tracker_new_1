package ru.job4j.ex;

public class JdbcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        } else {
            System.out.println("loading ... " + url);
        }
        /* jdbc*/
    }

    public static void main(String[] args) throws UserInputException {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputException e) {
            e.printStackTrace();
        }

        try {
            load(null);
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}