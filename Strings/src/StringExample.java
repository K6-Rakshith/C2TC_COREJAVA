public class StringExample {
    public static void main(String[] args) {
        // Creating and initializing strings
        String greeting = "Hello, ";
        String language = "Java";
        String message = greeting + language + " is fun!"; // Concatenating strings

        // String length
        int messageLength = message.length();

        // Accessing individual characters
        char firstCharacter = message.charAt(0);
        char lastCharacter = message.charAt(messageLength - 1);

        // Checking for a substring
        boolean containsJava = message.contains("Java");

        // Converting to uppercase
        String upperCaseMessage = message.toUpperCase();

        // Displaying the results
        System.out.println("Message: " + message);
        System.out.println("Message Length: " + messageLength);
        System.out.println("First Character: " + firstCharacter);
        System.out.println("Last Character: " + lastCharacter);
        System.out.println("Contains 'Java': " + containsJava);
        System.out.println("Uppercase Message: " + upperCaseMessage);
    }
}
