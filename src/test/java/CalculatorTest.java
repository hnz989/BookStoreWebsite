import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    Calculator calculator;

    @Test
    public void testAdd(){
        calculator = new Calculator();
        int a = 3;
        int b = 3;
        int expect = 6;
        Assertions.assertEquals(expect,calculator.add(a,b));
//        assertEquals(expect,calculator.add(a,b));

    }

}
