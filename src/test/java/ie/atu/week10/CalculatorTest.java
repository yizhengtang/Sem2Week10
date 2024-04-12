
package ie.atu.week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator newCalc;
    @Test
    void addTest(){
        newCalc = new Calculator();
        assertEquals(10, newCalc.add(4,6));
    }
    @Test
    void subtractTest(){
        newCalc = new Calculator();
        assertEquals(4, newCalc.subtract(10,6));
    }

    @Test
    void multiplyTest(){
        newCalc = new Calculator();
        assertEquals(60, newCalc.multiply(10,6));
    }

    @Test
    void divideTest(){
        newCalc = new Calculator();
        assertEquals(5, newCalc.divide(10,2));
    }
}
