package calc;

public class Calculator {
	
	public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        try {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return (double) a / b;
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }
}
