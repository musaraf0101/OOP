import java.util.Scanner;
class read{
}
class sorting{
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
class print{
}
public class threeMethod {
    public static void main(String[] args) {
        sorting sc = new sorting();
        int[] arr = {64, 34, 25, 12, 22, 11, 90,5,9};
        sc.sort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
