package elementaryClasses;

public class InsertionSort {

	public static void sort(Comparable[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int k = i; k > 0 && array[k].compareTo(array[k-1]) < 0; k--) {
				Comparable temp = array[k - 1];
				array[k - 1] = array[k];
				array[k] = temp;
			}
		}
	}
	
	public static void mySort(Comparable[] array) {
		Comparable[] output = new Comparable[array.length];
		int index = 0;
		Comparable temp;
		Comparable temp2;
		
		for (int i = 0; i < array.length; i++) {
			temp = null;
			temp2 = null;
			for (int k = 0; output[k] != null && output[k].compareTo(array[i]) < 1; k++)
				index = k + 1;

			for (int k = index; k < output.length; k++) {
				temp = output[k];
				output[k] = temp2;
				temp2 = temp;				
			}
			
			output[index] = array[i];
		}
		
		for (int i = 0; i < array.length; i++)
			array[i] = output[i];
	}
	
}
