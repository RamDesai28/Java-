public class UncheckedException{
    public static void main(String[] args) {
        // 1. ArithmeticException
        try {
            int result = 5 / 0; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // 2. NullPointerException
        try {
            String text = null;
            int length = text.length(); // Attempt to access a method on a null object
            System.out.println("Text length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            int value = numbers[4]; // Accessing an array element that doesn't exist
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 4. NumberFormatException
        try {
            String str = "abc";
            int num = Integer.parseInt(str); // Parsing a non-integer string
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
