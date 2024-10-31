import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTests {

    @Test
    void testStartBalance(){
        // Arrange
        BankAccount account = new BankAccount(100);
        int expected = 100;

        // Act
        int result = account.getBalance();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testDeposit(){
        // Arrange
        BankAccount account = new BankAccount();
        int expected = 100;

        // Act
        account.deposit(100);
        int result = account.getBalance();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testWithdraw(){
        // Arrange
        BankAccount account =  new BankAccount(100);
        int expected = 0;

        // Act
        account.withdraw(100);
        int result = account.getBalance();

        // Assert
        Assertions.assertEquals(expected, result);
    }

}
