package nov14;
//bubble, insertion, selection

public class Sorting {

	public void bubbleSort(int[] array) {
		int temp = 0;
		for(int i = 0; i<array.length; i++) {
			for(int j=1; j<array.length; j++) {
				if(array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	public void insertionSort(int[] array) {
		for(int i=1; i<array.length; i++) {
			int key = array[i];
			int j = i-1;
			while((j>=0) &&  array[j]>key) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public void selectionSort(int[] array) {
		int temp = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		Sorting sort = new Sorting();
		int[] array = {45, 2, 69, 65, 3};
		sort.bubbleSort(array);
		sort.insertionSort(array);
		sort.selectionSort(array);
	}

}
