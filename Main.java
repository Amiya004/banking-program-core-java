
import java.util.Scanner;

// Banking Program 

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        // Decalare Varaibles
        double balance = 0;
        boolean isRunning = true;
        int choice ;

        while(isRunning) {
            // Display Menu
            System.out.println("**********************");
            System.out.println("BANKING PROGRAM");
            System.out.println("**********************");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            System.out.println("**********************");

            // Get and Process Users chooice
            System.out.println("Enter your choice (1-4) : ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 ->
                    // System.out.println("SHOW BALANCE");
                    showBalance(balance);
                case 2 ->
                    // System.out.println("DEPOSIT");
                    balance += deposit();
                case 3 -> 
                    // System.out.println("WITHDRAW");
                    balance -= withdraw(balance);
                case 4 ->
                    isRunning = false ;
                default ->
                    System.out.println("INVALID CHOICE");
            }
        }
        
        System.out.println("**************************************");
        System.out.println("THANKYOU ! HAVE A NICE DAY...");
        System.out.println("**************************************");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("*********************");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {
        double amount ;

        System.out.println("Enter an amount to be deposited : ");
        amount= scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn : ");
        amount = scanner.nextDouble();
        
        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
        }
        else {
            return amount;
        } 
        return 0;
    }
}