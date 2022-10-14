
package Test;

import java.util.Scanner;

class Transaction {
    private String transactionType;
    private int accountNumber;
    private int Amount = 1000;

    public Transaction(String transactionType, int accountNumber, int amount) {
        this.transactionType = transactionType;
        this.accountNumber = accountNumber;
        Amount = Amount;
    }

    public void Amount() {
        System.out.println("Current Balance = " + Amount);
    }

    public void creditAmount(int credit) {
        Amount = Amount + credit;
        System.out.println("Amount after Credit = " + Amount);
    }

    public void debitAmount(int debit) {
        if (debit > Amount) {
            throw new ArithmeticException("Insufficient Balance");
        } else {
            Amount = Amount - debit;
            System.out.println("Amount After Debit = " + Amount);
        }
    }
}

class Customer extends Transaction {
    @Override
    public void Amount() {
        super.Amount();
    }

    @Override
    public void creditAmount(int credit) {
        super.creditAmount(credit);
    }

    @Override
    public void debitAmount(int debit) {
        super.debitAmount(debit);
    }

    private int id;
    private String name;
    private long mobile;
    private String email;

    public Customer(String transactionType, int accountNumber, int amount, int id, String name, long mobile, String email) {
        super(transactionType, accountNumber, amount);
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Q4 {
    public static void main(String[] args) {
        Customer customer = new Customer("Savings", 1234567890,100000, 9876, "Praj", 8600860887l, "PrajArote86@gmail.com");
        System.out.println(customer.toString());
        customer.Amount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to be credited: ");
        customer.creditAmount(sc.nextInt());
        System.out.println("Enter Amount to be debited: ");
        customer.debitAmount(sc.nextInt());

    }
}

