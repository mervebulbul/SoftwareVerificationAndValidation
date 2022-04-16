public class Calculator {

    public static double divide(double a, double b){
        double result;
        if(b == 0){
            throw new IllegalArgumentException("Division by zero error!");
        }
        result = a / b;
        return result;
    }

}
