package com.example.demo.model;


public class Account {
    private String accountType; //Account type
    private int accountNo; // accountNo
    private String accountName; //account Name
    private int balance; //account balance
    private String date; //date of today

    public Account(String accountType,int accountNo,String accountName,int balance, String date) {
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
        this.date = date;
    }


    public int getAccountNo(){
        return accountNo;
    }
    public String getAccountName(){
        return accountName;
    }
    public int getBalance(){
        return balance;
    }
    public String getDate(){
        return date;
    }
}


