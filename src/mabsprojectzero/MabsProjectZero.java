package mabsprojectzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MabsProjectZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Receipt> receiptList = new ArrayList<>();

        while (true) {
            // Display menu
            System.out.println("------------------------------");
            System.out.println("       Choose App to Use:      ");
            System.out.println("------------------------------");
            System.out.println("1. Salaries");
            System.out.println("2. Add Receipt");
            System.out.println("3. View Receipts");
            System.out.println("4. Account");
            System.out.println("5. Exit");
            System.out.println("------------------------------");
            System.out.print("Enter Choice: ");

            // Validate input for menu choice
            int choice;
            while (true) {
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    if (choice >= 1 && choice <= 5) {
                        break;
                    } else {
                        System.out.print("Invalid choice! Please select a valid option (1-5): ");
                    }
                } else {
                    System.out.print("Invalid input! Please enter a number (1-5): ");
                    sc.next();
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("You selected Salaries.");
                    Salaries.manageSalaries(); 
                    break;
                case 2:
                    System.out.println("You selected Add Receipt.");
                    addReceipt(sc, receiptList);
                    break;
                case 3:
                    System.out.println("You selected View Receipts.");
                    viewReceipts(receiptList);
                    break;
                case 4:
                    System.out.println("You selected Account.");
                    Account accountApp = new Account();
                    accountApp.addNewAccounts(); 
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    sc.close();
                    return; 
            }
        }
    }

    private static void addReceipt(Scanner sc, List<Receipt> receiptList) {
        System.out.print("Enter Customer Name: ");
        sc.nextLine(); // Consume the newline
        String customerName = sc.nextLine();
        
        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();
        
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        
        System.out.print("Enter Price: ");
        int price = sc.nextInt();
        
        System.out.print("Enter Cash: ");
        int cash = sc.nextInt();
        
        Receipt receipt = new Receipt(customerName, productName, quantity, price, cash);
        receiptList.add(receipt);
        
        System.out.println("Receipt added!\n");
    }

    private static void viewReceipts(List<Receipt> receiptList) {
        if (receiptList.isEmpty()) {
            System.out.println("No receipts available.");
        } else {
            for (Receipt receipt : receiptList) {
                receipt.display();
            }
        }
    }
}
