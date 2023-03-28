import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcDiscontTest {

    @Test
    public void testCalculateDiscountForEvenNumberBefore18() {
        double discount = CalcDiscont.calculateDiscount(2, 0);
        assertEquals(0.02, discount);
    }

    @Test
    public void testCalculateDiscountForOddNumberBefore18() {
        double discount = CalcDiscont.calculateDiscount(3, 0);
        assertEquals(0.0, discount);
    }

    @Test
    public void testCalculateDiscountForEvenNumberAfter18() {
        double discount = CalcDiscont.calculateDiscount(4, 1);
        assertEquals(0.04, discount);
    }

    @Test
    public void testCalculateDiscountForOddNumberAfter18() {
        double discount = CalcDiscont.calculateDiscount(5, 1);
        assertEquals(0.02, discount);
    }

    @Test
    public void testCalculateDiscountForFirstItemAfter18() {
        double discount = CalcDiscont.calculateDiscount(1, 1);
        assertEquals(0.02, discount);
    }
}