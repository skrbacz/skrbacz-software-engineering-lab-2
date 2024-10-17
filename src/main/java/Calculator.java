public class Calculator {
    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
       if (b== 0) {
           throw new ArithmeticException("Can't divide by zero");
       }
        return a / b;
    }
}
