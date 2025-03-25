import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketPriceDataFlowTest {
    @Test
    void testcase1() {
        assertEquals(70000, TicketPriceCalculator.tinhGiaVe(true, true, 10));
    }

    @Test
    void testcase2() { assertEquals(84000, TicketPriceCalculator.tinhGiaVe(false, true, 10));}

    @Test
    void testcase3() {
        assertEquals(90000, TicketPriceCalculator.tinhGiaVe(true, false, 10));
    }

    @Test
    void testcase4() {
        assertEquals(-1, TicketPriceCalculator.tinhGiaVe(true, true, -5));
    }

    @Test
    void testcase5() {
        assertEquals(100000, TicketPriceCalculator.tinhGiaVe(true, true, 30));
    }
    @Test
    void testcase6() {
        assertEquals(75000, TicketPriceCalculator.tinhGiaVe(true, true, 70));
    }

    @Test
    void testcase7() { assertEquals(108000, TicketPriceCalculator.tinhGiaVe(false, false, 10)); }
    @Test
    void testcase8() {
        assertEquals(90000, TicketPriceCalculator.tinhGiaVe(false, true, 70));
    }

    @Test
    void testcase9() {
        assertEquals(95000, TicketPriceCalculator.tinhGiaVe(true, false, 70));
    }

    @Test
    void testcase10() {
        assertEquals(120000, TicketPriceCalculator.tinhGiaVe(true, false, 30));
    }
}
