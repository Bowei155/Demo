import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testTest {
    test calculator;
    @BeforeEach
    void setUp() {calculator = new testTest()}

    @Test
    void add() {
        int a = 1;
        int b = 2;


        int actual = calculator.add(a+b);

        int expected = 3;
        assertEquals(expected,actual);
    }
}
