import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    int a = 4;
    int b = 3;


    @org.junit.jupiter.api.Test
    void add() {
        int expected = 7;
        Assertions.assertEquals(expected, Calculator.add(a, b));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Assertions.assertEquals(1, Calculator.subtract(a, b));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Assertions.assertEquals(12, Calculator.multiply(a, b));
    }
}