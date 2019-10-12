package com.sanja;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        this.balance +=depositAmount;
        System.out.println("Deposit of "+ depositAmount+ " made. New account balance is "+balance);
    }

    public void withdrawFunds(double withdrawal){
        if (balance - withdrawal < 0){
            System.out.println("Insufficient account balance "+balance+", withdrawal not processed");

        }else {
            balance -=withdrawal;
            System.out.println("Withdrawal of "+withdrawal+ " processed. Remaining balance is "+balance);

        }
    }
}
