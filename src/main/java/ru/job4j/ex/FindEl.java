package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < values.length; i++) {
            if (key.equals(values[i])) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("No such element \"" + key + "\" in array");
        }
        return result;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] values = new String[]{"A", "B", "C"};
        try {
            System.out.println(indexOf(values, "D"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
