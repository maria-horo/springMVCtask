package nov14;
////19.  Write a program to search an element from array 
//using sequential & binary search algorithms.

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public void binary(){ 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int size = sc.nextInt();
		
		int []array = new int[size];
		System.out.println("Enter " + size + " elements");
		
		for (int counter = 0; counter < size; counter++) {
			array[counter] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));

		System.out.println("Enter the search value:");
		int item = sc.nextInt();

		int first = array[0];
		int last = array[size - 1];
 
		while( first <= last ){  
			int mid = (first+last)/2; 
			if ( array[mid] < item ){  
				first = mid + 1;     
			}
			else if (array[mid] == item){  
				System.out.println("Element is found at index: " + mid);  
				break;  
			}
			else{  
				last = mid - 1;  
			}  
			mid = (first + last)/2;  
		}  
		if ( first > last ){  
			System.out.println("Element is not found!");  
		} 
		sc.close();
	}
	public static void main(String[] args) {
		BinarySearch biSearch = new BinarySearch();
		biSearch.binary();
	} 
}
