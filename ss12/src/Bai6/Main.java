package Bai6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("A", 20, 30000000, 2000000),
                new PartTimeEmployee("B", 25, 10000000, 20),
                new Intern("C", 22, 15000000)
        };

        for (Employee emp : employees) {
            System.out.println("------------------------");
            emp.showInfo();
        }
    }
}

