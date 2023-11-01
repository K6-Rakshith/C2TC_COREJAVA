public class ArrayExample {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = new int[5]; // An array of size 5

        // Assigning values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing and displaying array elements
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);

        // Calculating the sum of array elements
        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        System.out.println("Sum of array elements: " + sum);
    }
}
