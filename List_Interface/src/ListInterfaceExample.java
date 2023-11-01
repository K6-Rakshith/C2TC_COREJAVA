import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExample {
    public static void main(String[] args) {
        // Create a list to store items
        List<String> toDoList = new ArrayList<>();

        // Add items to the list
        toDoList.add("Task 1");
        toDoList.add("Task 2");
        toDoList.add("Task 3");

        // Access and display items from the list
        System.out.println("To-Do List:");
        for (String task : toDoList) {
            System.out.println(task);
        }

        // Remove an item from the list
        toDoList.remove("Task 2");

        // Update an item in the list
        toDoList.set(1, "Revised Task 3");

        // Display the updated list
        System.out.println("\nUpdated To-Do List:");
        for (String task : toDoList) {
            System.out.println(task);
        }
    }
}
