import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SmartCardTest {

    @Test
    void testTopUp() {
        SmartCard card = new SmartCard();
        card.setBalance(10);
        card.topUp(5);
        assertEquals(15, card.getBalance());
    }

    @Test
    void testDeductFare() {
        SmartCard card = new SmartCard();
        card.setBalance(20);
        boolean result = card.deductFare(10);
        assertTrue(result);
        assertEquals(10, card.getBalance());
    }

    @Test
    void testDeductFareFailsWhenInsufficientBalance() {
        SmartCard card = new SmartCard();
        card.setBalance(5);
        boolean result = card.deductFare(10);
        assertFalse(result);
        assertEquals(5, card.getBalance());
    }
}
