package nov14;
//19.  Write a program to search an element from array 
//using sequential & binary search algorithms.

import java.util.Arrays;
import java.util.Scanner;

public class SequentialSearch {
	public void sequential() {
		int counter, size, item;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		size = sc.nextInt();
		int []array = new int[size];
		System.out.println("Enter " + size + " elements");

		for (counter = 0; counter < size; counter++) {
			array[counter] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));

		System.out.println("Enter the search value:");
		item = sc.nextInt();

		for (counter = 0; counter<size; counter++) {
			if (array[counter] == item) {
				System.out.println(item + " is present at index " + counter);
				break;
			}
		}
		if (counter == size) {
			System.out.println("Element is not found!");
		}
		sc.close();
	}
	public static void main(String[] args) {
		SequentialSearch seqSearch = new SequentialSearch();
		seqSearch.sequential();
	}
}
