public class BankAccount {
    // Private field to store the account balance
    private double balance;

    // Getter method to retrieve the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to update the balance
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        } else {
            System.out.println("Invalid amount. Balance not updated.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        // Use the getter to check the balance
        double currentBalance = account.getBalance();
        System.out.println("Current balance: " + currentBalance);

        // Use the setter to deposit money
        account.setBalance(1000.0);

        // Use the getter again to check the updated balance
        currentBalance = account.getBalance();
        System.out.println("Updated balance: " + currentBalance);

        // Use the setter to attempt an invalid update (negative balance)
        account.setBalance(-200.0);
    }
}
