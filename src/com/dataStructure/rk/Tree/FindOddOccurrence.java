package com.dataStructure.rk.Tree;

public class FindOddOccurrence {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,1,2,3,4,4};
		int result = findOddOccurrence(arr);
		System.out.println(result);
	}

	/**
	 * <p>method returns of number that occurs odd number of times.<p>
	 * @param arr
	 * @return result The number that occur odd times
	 */
	private static int findOddOccurrence(int[] arr) {
		int result = 0;
		for (int i : arr) {
			result = result ^ i;
		}
		return result;
	}
}
