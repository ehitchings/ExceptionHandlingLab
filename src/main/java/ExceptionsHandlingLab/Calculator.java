package ExceptionsHandlingLab;

/**
 * Created by evanhitchings on 9/30/16.
 */
public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b) throws DivisionByZeroException{
        if(b == 0){
            throw new DivisionByZeroException("You cannot divide by zero!");
        }
        return a / b;
    }

    public static double squareRoot(int a) throws ComplexNumberException {
        if(a < 0){
            throw new ComplexNumberException("Negative Numbers don't have square roots");
        } return Math.sqrt(a);
    }

}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String s) {


    }
}
class ComplexNumberException extends Exception{
    public ComplexNumberException(String s) {

    }
}