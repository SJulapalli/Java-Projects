package elementaryClasses;

public class Runner {

	public static void main(String[] args) {
		String[] array = new String[15];
		array[1] = "a";
		array[3] = "b";
		array[4] = "c";
		array[2] = "d";
		array[0] = "e";
		array[5] = "f";
		array[13] = "g";
		array[7] = "h";
		array[10] = "i";
		array[9] = "j";
		array[11] = "k";
		array[6] = "l";
		array[8] = "m";
		array[14] = "n";
		array[12] = "o";

//		for (int i = 0; i < array.length; i++)
//			System.out.print(array[i] + ", ");
//			
//		System.out.println();
		long start = System.currentTimeMillis();
		QuickSort.sort(array);
		System.out.println((start - System.currentTimeMillis()) / 1000.0);
		
		array[1] = "a";
		array[3] = "b";
		array[4] = "c";
		array[2] = "d";
		array[0] = "e";
		array[5] = "f";
		array[13] = "g";
		array[7] = "h";
		array[10] = "i";
		array[9] = "j";
		array[11] = "k";
		array[6] = "l";
		array[8] = "m";
		array[14] = "n";
		array[12] = "o";
		
		start = System.currentTimeMillis();
		MergeSort.btmUpSort(array);
		System.out.println((start - System.currentTimeMillis()) / 1000.0);

//		for (int i = 0; i < array.length; i++)
//			System.out.print(array[i] + ", ");
		
	}
	
}
