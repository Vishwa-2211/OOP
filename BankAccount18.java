class BankAccount18 
{
    String accountHolderName;
    double balance;
    static double interestRate;

    BankAccount18(String name, double bal) 
    {
        accountHolderName = name;
        balance = bal;
    }

    double calculateInterest() 
    {
        return (balance * interestRate) / 100;
    }

    void displayInterest() 
    {   
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    static void updateInterestRate(double rate) 
    {
        interestRate = rate;
    }

    public static void main(String[] args) 
    {
        System.out.println("250393107014");
        BankAccount18.updateInterestRate(5.0);

        BankAccount18 a1 = new BankAccount18("Rajvi", 10000);
        BankAccount18 a2 = new BankAccount18("Anita", 20000);

        a1.displayInterest();
        a2.displayInterest();

        BankAccount18.updateInterestRate(6.0);
        System.out.println("After updating interest rate:\n");

        a1.displayInterest();
        a2.displayInterest();
    }
}