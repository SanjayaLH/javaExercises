package com.sanja;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.setAccountNumber("1234");
        bankAccount1.setBalance(5000d);
        bankAccount1.setCustomerName("kasun");
        bankAccount1.setEmail("kasun@gmail.com");
        bankAccount1.setPhoneNumber("071 1231231");

        System.out.println("Account balance = "+bankAccount1.getBalance());
        bankAccount1.withdrawFunds(1000.0);
        bankAccount1.depositFunds(500.0);

        bankAccount1.withdrawFunds(5000.0);

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Bob",2500.0);
        System.out.println(vipCustomer2.getName());

        VipCustomer vipCustomer3 = new VipCustomer("Tim", 3000.0, "tim@gmail.com");
        System.out.println(vipCustomer3.getName());



    }
}
