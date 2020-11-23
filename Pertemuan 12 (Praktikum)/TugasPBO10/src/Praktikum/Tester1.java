package Praktikum;

public class Tester1 {

    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee e;
        IPayable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
