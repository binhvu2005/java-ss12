package Bai2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Tổng của 2 số: " + calculator.add(1, 2));
        System.out.println("Tổng của 3 số: " + calculator.add(1, 2, 3));
    }
}
