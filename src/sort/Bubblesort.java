package sort;
/**
 * @author akhileshtripathi
 *
 */

public class Bubblesort {

	public static void main(String[] args) {
		int[] intArray = { 25, 34, -16, 7, 22, 2, -23 };

		// We will start index from last unsorted index because at that point we can
		// start sorting
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			// To bubble largest unsorted array element, we will have to start with inner
			// loop
			for (int i = 0; i < lastUnsortedIndex; i++) {
				// If value of i > value of i+1. we will do sorting i.e.
				if (intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i + 1);
				}

			}

		}
		// Lets print the value of sorted array
		for (int i = 0; i < intArray.length; i++) {

			System.out.println(intArray[i]);
		}

	}

	// Algorithm to swap elements
	public static void swap(int[] array, int i, int j) {

		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
