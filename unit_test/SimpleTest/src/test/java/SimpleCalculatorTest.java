import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwo () {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.addition(2, 2));
    }
    @Test
    void sevenPlusThree() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10,calculator.addition(7,3) );
    }
    @Test
    void NineMultiFive () {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(46, simpleCalculator.multi(9, 5));
    }


}