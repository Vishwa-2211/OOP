import java.util.Scanner;

class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
	System.out.println("250393107014");
        System.out.println("Account Opened Successfully!");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {

    double interestRate = 5; 

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest on Saving Account: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {

    double interestRate = 7;

    void maturityAmount(int years) {
        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}

public class Practical23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Vishwa", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println("-------------------------");

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Vishwa", 50000);
        fd.checkBalance();
        fd.maturityAmount(3);  

        sc.close();
    }
}