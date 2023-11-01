package wrapper_class;

public class WrapperExample {
    public static void main(String[] args) {
        // Using wrapper classes to work with primitive data types
        Integer integerNumber = 42; // Wrapping an int value in an Integer object
        Double doubleNumber = 3.14; // Wrapping a double value in a Double object
        Character character = 'A'; // Wrapping a char value in a Character object
        Boolean bool = true; // Wrapping a boolean value in a Boolean object

        // Unwrapping to retrieve the primitive values
        int unwrappedInt = integerNumber; // Unwrapping an Integer to int
        double unwrappedDouble = doubleNumber; // Unwrapping a Double to double
        char unwrappedChar = character; // Unwrapping a Character to char
        boolean unwrappedBool = bool; // Unwrapping a Boolean to boolean

        System.out.println("Wrapped and Unwrapped Values:");
        System.out.println("Integer: " + integerNumber + " -> " + unwrappedInt);
        System.out.println("Double: " + doubleNumber + " -> " + unwrappedDouble);
        System.out.println("Character: " + character + " -> " + unwrappedChar);
        System.out.println("Boolean: " + bool + " -> " + unwrappedBool);
    }
}

