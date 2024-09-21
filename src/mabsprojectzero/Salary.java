package mabsprojectzero;

public class Salary {
    public String id;
    public String name;
    public double rate;
    public int hoursWorked;
    public double deduction;

   
    public Salary(String id, String name, double rate, int hoursWorked, double deduction) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.hoursWorked = hoursWorked;
        this.deduction = deduction;
    }

   
    public double calculateGross() {
        return rate * hoursWorked;
    }

    
    public double calculateNetPay() {
        return calculateGross() - deduction;
    }

  
    public void displaySalary() {
        System.out.printf("ID: %s, Name: %s, Gross Pay: %.2f, Deductions: %.2f, Net Pay: %.2f%n",
                id, name, calculateGross(), deduction, calculateNetPay());
    }
}
