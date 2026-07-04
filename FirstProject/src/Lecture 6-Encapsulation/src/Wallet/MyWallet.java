package Wallet;

class MyWallet {
    private double balance;

    public MyWallet(double balance){
        this.balance=balance;
    }

    public void addMoney(double money){
        if (money<0){
            System.out.println("Invalid amount");
            return; // this was missing
        }
        // balance++; wrong
        balance+=money;
        printTransactionLog("Added Money: "+money);
    }

    public void spendMoney(double money){
        if (money>balance){
            System.out.println("Not enough balance");
            return;
        }
        //balance--;
        balance-=money;
        printTransactionLog("Spent Money: "+money);
    }

    private void printTransactionLog(String msg){
        System.out.println("[LOG] " + msg + " | Balance: " + balance);

    }

    public double getBalance() {
        return balance;
    }
}
