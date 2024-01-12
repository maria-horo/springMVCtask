package nov14;

public class SortAscDescArray {
	
	public void sortAscending() {
		int[] array = {4, 0, 55, 96, 21, 3, 5};
		int temp = 0;
		for(int i = 0; i<array.length; i++) {
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
		System.out.println();
	}
	
	public void sortDescending() {
		int[] array = {4, 0, 55, 96, 21, 3, 5};
		int temp = 0;
		for(int i = 0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] < array[j]) {
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
		SortAscDescArray sortAscDescArray = new SortAscDescArray();
	sortAscDescArray.sortAscending();
	sortAscDescArray.sortDescending();
	}

}
