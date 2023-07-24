import java.util.Arrays;
import java.util.Random;

public class Main {

    // An optimized version of Bubble Sort
    // Still the time complexity is O(n^2)
    // but using the boolean and the restricted range of the inner loop
    // the number of iterations is reduced
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            // inner loop goes until j < array.length - 1 - i
            // because we know that for each i the element is in place
            for (int j = 0; j < array.length - 1 - i; j++) {

                // Swap array[j] and array[j+1]
                // and set swapped to true
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false) {
                break;
            }
        }

        return array;
    }


    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(-50, 50);
        }

        System.out.println("Array before bubble sort: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Array after bubble sort: " + Arrays.toString(array));
    }
}