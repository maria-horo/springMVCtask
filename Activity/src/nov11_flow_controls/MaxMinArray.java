package nov11_flow_controls;
//6. WAP to find max & min value from given integer array variable.

public class MaxMinArray {
	int findingMax(int[] array) {
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if( max < array[i] ) {
				int temp = array[i];
				array[i] = max;
				max = temp;
			}
		}
		return max;
	}
	
	int findingMin(int[] array) {
		int min = array[0];
		for(int i = 0; i<array.length; i++) {
			if(min > array[i]) {
				int temp = array[i];
				array[i] = min;
				min = temp;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] array = {45, 96, 23, 101, 69, 17, 84};
		MaxMinArray maxmin = new MaxMinArray();
		System.out.println(maxmin.findingMax(array));
		System.out.println(maxmin.findingMin(array));
	}
}
