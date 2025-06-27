package elementaryClasses;

public class QuickSort {

	public static void sort(Comparable[] array) {
		sort(array, 0, array.length - 1);
	}
	
	public static void sort(Comparable[] array, int lo, int high) {
		if (high <= lo) {
			return;
		} else {
			Comparable p = array[lo];
			Comparable[] aux = new Comparable[high - lo + 1];
			int front = lo;
			int back = high;
			
			for (int i = 0; i < aux.length; i++)
				aux[i] = array[front++];
			
			front = lo;
			
			for (int i = 0; i < aux.length; i++) {
				if (aux[i].compareTo(p) < 0) {
					array[front] = aux[i];
					front++;
				} else if (aux[i].compareTo(p) > 0) {
					array[back] = aux[i];
					back--;
				}
			}
			array[front] = p;
			sort(array, lo, back);
			sort(array, back + 1, high);
		}
	}
	
}
