import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testDeposit() {
        Account account = new Account();
        account.deposit(200.0);
        assertEquals(200.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        Account account = new Account();
        account.deposit(500.0);
        account.withdraw(150.0);
        assertEquals(350.0, account.getBalance());
    }

    @Test
    public void testInitialBalance() {
        Account account = new Account();
        assertEquals(0.0, account.getBalance());
    }
}
