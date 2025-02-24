class SavingsAccount {
    private static double annualInterestRate; // Static variable for annual interest rate
    private double savingsBalance; // Instance variable for savings balance

    // Constructor to initialize savings balance
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    // Method to calculate monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest; // Add interest to the balance
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Method to get the current balance
    public double getBalance() {
        return savingsBalance;
    }
}