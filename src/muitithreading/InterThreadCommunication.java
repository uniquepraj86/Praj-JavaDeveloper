package muitithreading;

class Bank {
    int TotalAmount = 0;

    synchronized void deposit(int amount) {
        TotalAmount += amount;
        System.out.println("Total Amount" + TotalAmount);
        notify();
    }

    synchronized void withdrawMoney(int amount) {
        if (amount > TotalAmount) {
            System.out.println("Insufficient Balance");
        }
        TotalAmount -= amount;
        System.out.println("Remaining amount " + TotalAmount);
    }

}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        new Thread() {
            @Override
            public void run() {
                bank.withdrawMoney(100);
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                bank.deposit(500);
            }
        }.start();
    }
}
