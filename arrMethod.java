import java.util.Scanner;

public class arrMethod {
    public static int[] read() {
        System.out.println("Enter Array Size");
        Scanner ab = new Scanner(System.in);
        int arrSize = 0;

        if (ab.hasNextInt()) {
            arrSize = ab.nextInt();
        }

        if (arrSize <= 0) {
            System.out.println("Array size must be greater than 0.");
            return new int[0]; // Return an empty array
        }

        int[] arr = new int[arrSize];
        System.out.println("Enter the elements");

        for (int i = 0; i < arrSize; i++) {
            if (ab.hasNextInt()) {
                arr[i] = ab.nextInt();
            }
        }
        System.out.println("Elements of array:");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // For better formatting

        return arr; // Return the populated array
    }

    /* Sorting method */
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // For better formatting
    }

    public static void print() {
        int[] arr = read(); // Get the array from read()
        if (arr.length > 0) { // Only sort if the array is not empty
            sort(arr);
        }
    }

    public static void main(String[] args) {
        print();
    }
}