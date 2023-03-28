package bank;

import java.util.List;

public class Bank {

    List<Account> accounts;

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    public void showBalance() {
        for (Account account : this.accounts) {
            System.out.println("Account " + account.getId() + " has a balance of " + account.getBalance());
        }
    }

    public void transfer(Account account1, Account account2, int amount) {
        account1.debit(amount);
        account2.credit(amount);
    }
}
