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

    public static int divide(int a, int b) throws ArithmeticException{
        return a / b;
    }

}
