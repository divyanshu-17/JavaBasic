package com.example.BankExample;

class AccountDetails {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    public AccountDetails(String accountNo, String accountHolderName) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money){
        if (money<=0){
            System.out.println("Invalid Amount");
        }else {
            balance += money;
        }
    }

    public double withdrawMoney(double money){
        if (money<=0) {  // -ve no
            System.out.println("Invalid Amount");
        }
        else if (balance>=money){  // balance zayda hai money se
            balance -= money;
        } else {                                  // paise zayda ho to jitne h nikal do aur balance 0 kr do
            System.out.println("Your current balance is "+balance+" and you're asking for "+money);
            System.out.println("So we'll deduce "+balance+" and now your balance is ");
            money=balance;
            balance=0;
        }
        return balance;


    }
    public double currBalance(){
        if (balance<=0){
            System.out.println(balance+" Bhak Gareeb!");
        }else {
            System.out.println("Your balance: "+balance);
        }
        return this.balance;
    }

//    public double deposit;
//    public double withdraw;
//
//    public AccountDetails(String accountNo, String accountHolderName) {
//        this.accountNo = accountNo;
//        this.accountHolderName = accountHolderName;
//    }
//
//    public String getAccountNo(){
//        return accountNo;
//    }
//
//    public String getAccountHolderName(){
//        return accountHolderName;
//    }
//
//    public double cashDeposit(double deposit){
//        return this.deposit=deposit;
//    }
//
//    public double currBalance(double deposit){
//        return balance+=deposit;
//    }
//
//    public double cashWithdraw(double deposit) {
//        return this.deposit = deposit;
//    }
}
