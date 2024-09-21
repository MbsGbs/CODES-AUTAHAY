package mabsprojectzero;

import java.util.Scanner;

public class Salaries {
    private String id;
    private String name;
    private double rate;
    private int hoursWorked;
    private double deduction;

    public Salaries(String id, String name, double rate, int hoursWorked, double deduction) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.hoursWorked = hoursWorked;
        this.deduction = deduction;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getDeduction() {
        return deduction;
    }

    public double calculateGross() {
        return rate * hoursWorked;
    }

    public double calculateNetPay() {
        return calculateGross() - deduction;
    }

    public static void manageSalaries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Employees: ");
        int numEmployees = sc.nextInt();
        sc.nextLine(); 

        Salaries[] employees = new Salaries[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Rate: ");
            double rate = sc.nextDouble();

            System.out.print("Hours Worked: ");
            int hoursWorked = sc.nextInt();

            System.out.print("Deduction: ");
            double deduction = sc.nextDouble();
            sc.nextLine(); // Clear newline

            employees[i] = new Salaries(id, name, rate, hoursWorked, deduction);
        }

     
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "ID", "Name", "Rate", "Hours", "Gross", "Deduction", "Net Pay");
        for (Salaries employee : employees) {
            System.out.printf("%-10s %-10s %-10.2f %-10d %-10.2f %-10.2f %-10.2f\n",
                    employee.getId(),
                    employee.getName(),
                    employee.getRate(),
                    employee.getHoursWorked(),
                    employee.calculateGross(),
                    employee.getDeduction(),
                    employee.calculateNetPay());
        }

        sc.close();
    }
}
