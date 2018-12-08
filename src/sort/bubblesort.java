package sort;

public class bubblesort {

	public static void main(String[] args) {

	
	}

	// Algorithm to swap elements
	public static void swap(int i, int j, int[] array) {

		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
