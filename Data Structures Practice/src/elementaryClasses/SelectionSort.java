package elementaryClasses;

public class SelectionSort {
	
	public static void sort(Comparable[] array) {
		int min;
		Comparable temp;
		
		if (array.length == 0 || array == null) {} else {
			
			for (int i = 0; i < array.length; i++) {
				min = i;
				
				for (int k = i; k < array.length; i++) {
					if (array[k].compareTo(array[min]) < 0)
						min = k;
				}
				
				temp = array[i];
				array[i] = min;
				array[min] = temp;
			}
		}
	}
	
}