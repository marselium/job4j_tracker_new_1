package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String msg;

    public Error() {

    }

    public Error(boolean active, int status, String msg) {
        this.active = active;
        this.status = status;
        this.msg = msg;
    }

    public void getError() {
        System.out.println("Is active: " + this.active);
        System.out.println("Status: " + this.status);
        System.out.println("Error message: " + this.msg);
    }

    public static void main(String[] args) {
        Error err1 = new Error(true, 1, "No data found");
        Error err2 = new Error(true, 2, "Too many rows");
        Error noErr = new Error(false, 0, "");
        err1.getError();
        err2.getError();
        noErr.getError();
    }
}
