package Account;

import Account.Account;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

       account.setBalance(10000);
        System.out.println("현재잔고:"+account.getBalance());

        account.setBalance(-10000);
        System.out.println("현재잔고:"+account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재잔고:"+account.getBalance());

        account.setBalance(300000);
        System.out.println("현재잔고:"+account.getBalance());

    }
}
