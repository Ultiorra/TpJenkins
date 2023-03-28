package bank;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNull;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        Account a = new Account(1,12,14);
        a.credit(3);
        assertEquals(15, a.getBalance());
    }

    @Test
    public void testWithdraw() {
        Account a = new Account(1,12,14);
        a.debit(2);
        assertEquals(10, a.getBalance());
    }

    @Test
    public void testTransferAToA() {
        Account a1 = new Account(1,12,14);
        Account a2 = new Account(2,150,5);
        a1.transfer(a2, 2);
        assertEquals(10, a1.getBalance());
        assertEquals(152, a2.getBalance());
    }
    @Test
    public void testAddAccount() {
        Account a = new Account(1,0,0);
        Bank b = new Bank(List.of(a));

        assertEquals(a, b.getAccount(a.getId()));
    }
    @Test
    public void testRemoveAccount() {

        Account a = new Account(1,0,0);
        Bank b = new Bank(new ArrayList<Account>() {{
            add(a);
        }});
        b.removeAccount(a);
        assertNull(b.getAccount(a.getId()));
    }
    @Test
    public void testTransferBtoA() {

        Account a1 = new Account(1,5,0);
        Account a2 = new Account(2,5,5);
        Bank b = new Bank(List.of(a1, a2));

        b.transfer(a1, a2, 5);
        assertEquals(0, a1.getBalance());
        assertEquals(10, a2.getBalance());
    }
}
