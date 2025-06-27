package elementaryClasses;

public class ShellSort {

	public static void sort(Comparable[] array) {
		int h = 1;
		while (h < array.length/3)
			h = h * 3 + 1;
		
		while (h >= 1) {
			for (int i = h; i < array.length; i++) {
				for (int k = i; k > 0 && array[k].compareTo(array[k - 1]) < 0; k -= h) {
					Comparable temp = array[k - 1];
					array[k - 1] = array[k];
					array[k] = temp;
				}
			}
			h = h/3;
		}
	}
}
