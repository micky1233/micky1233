import java.util.Scanner;

public class Arrayinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the length of the array
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        // Declare the array
        int[] numbers = new int[length];

        // Take input for each element
        System.out.println("Enter " + length + " numbers:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("You entered:");
        for (int i = 0; i < length; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }

        scanner.close();
    }
}
