public class GenericClassExample<T> {
    private T item; // A generic item of type T

    public GenericClassExample(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void displayItem() {
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {
        // Create instances of the generic class with different types
        GenericClassExample<String> stringContainer = new GenericClassExample<>("Hello, Generic!");
        GenericClassExample<Integer> integerContainer = new GenericClassExample<>(42);

        // Access and display the items
        String strItem = stringContainer.getItem();
        int intItem = integerContainer.getItem();

        stringContainer.displayItem(); // Displays "Item: Hello, Generic!"
        integerContainer.displayItem(); // Displays "Item: 42"
    }
}
