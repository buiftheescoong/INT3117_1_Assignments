import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicketPriceControlFlowTest {

    @Test
    void testcase1() {
        assertEquals(-1, TicketPriceCalculator.tinhGiaVe(true, true, -10));
    }

    @Test
    void testcase2() {
        assertEquals(90000, TicketPriceCalculator.tinhGiaVe(true, false, 10));
    }

    @Test
    void testcase3() {
        assertEquals(90000, TicketPriceCalculator.tinhGiaVe(false, true, 70));
    }

    @Test
    void testcase4() {
        assertEquals(120000, TicketPriceCalculator.tinhGiaVe(false, true, 50));
    }

}

