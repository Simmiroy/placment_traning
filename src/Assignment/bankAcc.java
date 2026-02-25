package Assignment;
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    public double getBalance() {
        return balance;
    }
}

public class bankAcc {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 5400);
        acc.deposit(1500);
        acc.withdraw(2000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
