package Wallet;

public class WalletTest {
    public static void main(String[] args) {
        MyWallet user= new MyWallet(555.87);
        user.addMoney(-7);
        user.spendMoney(600);
        System.out.println(user.getBalance());
        user.addMoney(9000.13);
        System.out.println(user.getBalance());

    }
}
