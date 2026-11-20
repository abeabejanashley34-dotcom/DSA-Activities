import java.util.Scanner;

public class LinearSearchActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask for the number of elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Create an array with size n
        int[] arr = new int[n];

        // 2. Input each value into the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // 3. Ask for the value to search
        System.out.print("Enter value to search: ");
        int target = scanner.nextInt();

        // 4. Search the array sequentially (Linear Search)
        int foundIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                foundIndex = i;
                break;
            }
        }

        // 5. Display result (index if found, message if not found)
        if (foundIndex != -1) {
            System.out.println("Value found at index " + foundIndex + ".");
        } else {
            System.out.println("Value not found in the array.");
        }

        scanner.close();
    }
}