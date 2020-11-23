package Praktikum;

public class IntershipEmployee extends Employee {

    private int length;

    public IntershipEmployee(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getEmployeeInfo() {
        String info = super.getEmployeeinfo() + "\n";
        info += "Registered as Intership Employee for " + length + " month/s\n";
        return info;
    }
}
