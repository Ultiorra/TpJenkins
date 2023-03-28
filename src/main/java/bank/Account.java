package bank;

public class Account {

    private int id;
    private int balance;
    private float taux;

    public Account(int id, int balance, float taux) {
        this.id = id;
        this.balance = balance;
        this.taux = taux;
    }

    public float getTaux() {
        return taux;
    }

    public int getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    public void credit(int amount) {
        this.balance += amount;
    }

    public void debit(int amount) {
        this.balance -= amount;
    }

    public void transfer(Account account, int amount) {
        this.debit(amount);
        account.credit(amount);
    }

    public void applyInterest() {
        this.balance += this.balance * this.taux;
    }
}
