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
        try{
            Assert.assertEquals("Divide did not divide properly", DivisionByZeroException.class, Calculator.divide(25, 0));
        } catch (DivisionByZeroException e){
            System.err.println(e.getMessage());
        }

    }

    @Test
    public void squareRootTest(){
        try{
            Assert.assertEquals("Square Root did not fail on negative numbers", ComplexNumberException.class, Calculator.squareRoot(-5));
        } catch (ComplexNumberException e){
            System.err.println(e.getMessage());
        }

    }


//    @Test(expected = DivisionByZeroException.class)
//    public void divideEx(){
//        try{
//            Calculator.divide(5, 0);
//        } catch (DivisionByZeroException e){
//            e.getMessage();
//        }
//    }






}




