public class SelectionSort implements SortingAlgorithm {

	public void sort(int [] array) {
		for(int i = 0; i < array.length - 1; i++) {
			int minimum = i;
			for(int j = i + 1; j < array.length; j++) {
					if(array[minimum] > array[j]) {
						minimum = j;
					}
			}
			int temp_var = array[minimum];
			array[minimum] = array[i];
			array[i] = temp_var;
		}
	}
}