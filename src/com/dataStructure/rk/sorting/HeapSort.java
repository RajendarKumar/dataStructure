package com.dataStructure.rk.sorting;

public class HeapSort {

	public static void main(String[] args) {

		 int arr[] = {12, 11, 13, 5, 6, 7};
		 buildHeap(arr);
		 for (int i : arr) {
			System.out.println(i);
		}
	}
	
	static void buildHeap(int heap[]) {
		//Started building from n/2 as rest of the elements are already max heap individual
		//as they do not have children.
		for (int i = heap.length/2; i >= 0; i--) {
			maxHeapify(heap, heap.length, i);
		}
		//Get the max element and swap with last and maxHeapify again until you have 1 element to sort.
		for (int i = heap.length-1; i > 0; i--) {
			swap(heap, 0, i);
			maxHeapify(heap, i, 0);
		}
	}

	/**
	 * <p>maxHeapify will bring the maximum element at root.<p>
	 * @param heap
	 * @param size
	 * @param i
	 */
	static void maxHeapify(int heap[], int size, int i) {
		int l = 2*i + 1;
		int r = 2*i+2;
		int largest = i;
		
		if(l < size && heap[l] > heap[i]) {
			largest = l;
		}
		if(r < size && heap[r] > heap[largest]) {
			largest = r;
		}
		if(largest != i) {
			swap(heap, largest, i);
			maxHeapify(heap, size, largest);
		}
	}
	
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j] = temp;
	}
}
