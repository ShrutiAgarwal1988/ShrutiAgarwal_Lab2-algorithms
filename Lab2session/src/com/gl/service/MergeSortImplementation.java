package com.gl.service;

public class MergeSortImplementation {
	void merge(int a[], int left, int mid, int right) {
		// Find the size of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Creating temp arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		/* Copying data to temp arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = a[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = a[mid + 1 + j];

		/* Now Merging the temp arrays */

		// Initial indexes of first and second left and right sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				a[k] = leftArray[i];
				i++;
			} else {
				a[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of LeftArray[] if any */
		while (i < n1) {
			a[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of rightArray[] if any */
		while (j < n2) {
			a[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Main function that sorts array[left...right] using merge()
	public void sort(int[] notes, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sort(notes, left, mid);
			sort(notes, mid + 1, right);

			// Merge the sorted halves
			merge(notes, left, mid, right);
		}
	}
}

