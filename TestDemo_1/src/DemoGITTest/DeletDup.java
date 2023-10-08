package DemoGITTest;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DeletDup {

	public static void main(String[] args) {

		findmin();

		//===============REMOVE DUPLICATE========================================================//
		int a[] = { 1, 1, 2, 2, 2,66,66,78,87,99};
		int n = a.length;

		
		n = removeduplicates(a, n);

		// Printing The array elements
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		
		
		
	}

	public static int findmin() {

		// Initialize array
		int[] arr = new int[] { 25, 11, 7, 75, 56 };
		// Initialize min with first element of array.
		int min = arr[0];
		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with min
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest element present in given array: " + min);
		return min;

	}

	public static int removeduplicates(int a[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		// creating another array for only storing
		// the unique elements
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}

		temp[j++] = a[n - 1];

		// Changing the original array
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}

		return j;
	}

	// ==================================================================//

}