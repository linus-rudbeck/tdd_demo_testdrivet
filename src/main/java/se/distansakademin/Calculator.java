package se.distansakademin;

public class Calculator {

    public static int add(int a, int b) {
        // Initialize sum as 0
        int sum = 0;

        // Add a to the sum
        sum += a;

        // Add b to sum
        sum += b;

        // Return the result
        return sum;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }
}
