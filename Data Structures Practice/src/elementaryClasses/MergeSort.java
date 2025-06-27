package elementaryClasses;

public class MergeSort {

	public static void merge(Comparable[] array, int lo, int mid, int high) {
		int x = lo;
		int y = mid + 1;
		Comparable[] temp = new Comparable[array.length];
		
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		
		for (int i = lo; i <= high; i++) {
			if (x > mid) {
				array[i] = temp[y];
				y++;
			} else if (y > high) {
				array[i] = temp[x];
				x++;
			} else if (temp[x].compareTo(temp[y]) < 1) {
				array[i] = temp[x];
				x++;
			} else {
				array[i] = temp[y];
				y++;
			}
		}
	}
	
	public static void btmUpSort(Comparable[] array) {
		for (int i = 1; i < array.length; i *= 2) {
			for (int k = 0; k < array.length - i; k += 2*i) {
				merge(array, k, k + i - 1, Math.min(k + 2*i - 1, array.length - 1));
			}
		}
	}
	
	public static void sort(Comparable[] array) {
		sort(array, 0, array.length - 1);
	}
	
	private static void sort(Comparable[] array, int lo, int high) {
		if (high <= lo) {
			return;
		} else {
			sort(array, lo, (lo + high) / 2);
			sort(array, (lo + high) / 2 + 1, high);
			merge(array, lo, (lo + high) / 2, high);
		}
	}
	
}
