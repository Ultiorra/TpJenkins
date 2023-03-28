package bank;

import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        for (Account a : this.accounts) {
            if (a.getId() == account.getId()) {
                this.accounts.remove(a);
                break;
            }
        }
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


    public Account getAccount(int id) {
        for (Account account : this.accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }
}
