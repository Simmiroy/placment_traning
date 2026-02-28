package nestedclasses;

import threads.BackAccount;

public class BankAccount {
    private double Balance =150000;
    class Transaction{
        void withdraw(double amount){                                  //Member class Example.
            if(amount<=Balance){
                Balance-=amount;
                System.out.println("withdraw : " + amount);
            }else{
                System.out.println("Insufficient funds. ");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount.Transaction tx = account.new Transaction();
        tx.withdraw(5000);
        tx.withdraw(2000);
        System.out.println("Final balance : " + account.Balance);

    }
}
/*
Points to remember:
Transaction belongs t a specific account
Direct access to private variable balance
Clean encapsulation .
*/