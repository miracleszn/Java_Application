public class SavingsAccountTest {
    public static void main(String[] args) {
        // Create two SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate monthly interest for 12 months
        System.out.println("Balances after 12 months at 4% interest:");
        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("Month %d: Saver 1 Balance: $%.2f, Saver 2 Balance: $%.2f%n", 
                              month, saver1.getBalance(), saver2.getBalance());
        }

        // Set annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate monthly interest for the next month
        System.out.println("\nBalances after 1 month at 5% interest:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 Balance: $%.2f, Saver 2 Balance: $%.2f%n", 
                          saver1.getBalance(), saver2.getBalance());
    }
}