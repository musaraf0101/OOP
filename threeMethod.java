import java.util.Scanner;
public class threeMethod {
    /*reading method  */
    public static void read(){
        System.out.println("Enter Array Size");
        Scanner ab = new Scanner(System.in);
        int arrSize=0;
        if(ab.hasNextInt()){
            arrSize = ab.nextInt();
        }
        int [] arr = new int [arrSize];
        System.out.println("Enter the elements");

        for(int i=0;i<arrSize;i++){
            if(ab.hasNextInt()){
                arr[i] = ab.nextInt();
            }
        }
        System.out.println("Element of array");
        for(int i=0;i<arrSize;i++){
            System.out.println(arr[i]+" ");
        }

        ab.close();
    }


    /* sorting method*/

    public static void sort(int[] arrSize) {
        for (int i = 1; i < arrSize.length; i++) {
            int key = arrSize[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arrSize[j] > key) {
                arrSize[j + 1] = arrSize[j];
                j = j - 1;
            }
            arrSize[j + 1] = key;
        }
        sort(arrSize);
        System.out.println("Sorted array:");
        for (int i : arrSize) {
            System.out.print(i + " ");
    }
}
    /* */

    public static void print(){
        int [] arr = read();
        if(arr.length>0){
            sort(arr);
        }
    }
    public static void main(String[] args) {
        print();
    }
}