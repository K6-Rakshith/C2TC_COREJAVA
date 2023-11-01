public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Code that may throw an exception
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Code that always executes, whether there's an exception or not
            System.out.println("This block always runs.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
