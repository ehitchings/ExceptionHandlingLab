package ExceptionsHandlingLab;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by evanhitchings on 9/30/16.
 */
public class CalculatorTest {


    @Test
    public void addTest(){
        Assert.assertEquals("Add did not add two ints correctly", 10, Calculator.add(5, 5));
        //Integer a= null;
        //Assert.assertEquals("Add did not ", java.lang.NullPointerException, Calculator.add(a, 5));
    }

    @Test
    public void subtractTest(){
        Assert.assertEquals("Subtract did not subtract properly", -5, Calculator.subtract(5, 10));
    }

    @Test
    public void multiplyTest(){
        Assert.assertEquals("Multiply did not multiply properly", 25, Calculator.multiply(5,5));

    }

    @Test
    public void divideTest(){
        Assert.assertEquals("Divide did not divide properly", 5, Calculator.divide(25, 5));

    }

    @Test(expected = ArithmeticException.class)
    public void divideEx(){
        Calculator.divide(5, 0);
    }






}


