import java.util.ArrayList;
import java.util.List;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // Creating a list (a type of collection)
        List<String> fruits = new ArrayList<>();

        // Adding items to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Accessing and displaying items from the list
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if a specific item is in the list
        String searchFruit = "Banana";
        boolean containsFruit = fruits.contains(searchFruit);

        System.out.println("Contains " + searchFruit + "? " + containsFruit);
    }
}
