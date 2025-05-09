package ru.job4j.oop;

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
    }

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public Computer(int ssd, String cpu) {
        this.cpu = cpu;
        this.ssd = ssd;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + this.multiMonitor);
        System.out.println("SSD: " + this.ssd + " GB");
        System.out.println("Модель CPU: " + this.cpu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "14900k");
        computer.printInfo();
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        comp.printInfo();
        Computer computer1 = new Computer();
        computer1.printInfo();
        Computer first = new Computer();
        Computer second = new Computer(500, "Baikal 2");
        second.printInfo();
        Computer third = new Computer(true, 512.0, "COOL");
        third.printInfo();
    }
}
