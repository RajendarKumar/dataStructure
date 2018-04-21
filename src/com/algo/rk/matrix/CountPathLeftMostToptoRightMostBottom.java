package com.algo.rk.matrix;

public class CountPathLeftMostToptoRightMostBottom {

	public static void main(String[] args) {
	        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	        int result[] = new int[1];
	        count(arr, 0, 0,result);
	        System.out.println(result[0]);
	        System.out.println(count(arr, 0, 0));
	}
	/**
	 * <p>Count number of paths from top left most cell to bottom right most cell in mXn matrix.<p>
	 * @param arr
	 * @param row
	 * @param col
	 * @param result
	 */
	
	static void count(int arr[][], int row, int col, int result[]) {
		if(row >= arr.length-1 && col >= arr[0].length-1) {
			 result[0]=result[0]+1;
			 return;
		}
		if(row >= arr.length || col >= arr[0].length) {
			return ;
		}
		
		count(arr, row, col+1,result);
		count(arr, row+1, col,result);
	}
	
	/**
	 * <p>Count number of paths from top left most cell to bottom right most cell in mXn matrix.<p>
	 * @param arr
	 * @param row
	 * @param col
	 * @return totalpath
	 */
	static int count(int arr[][], int row, int col) {
		if(row >= arr.length-1 && col >= arr[0].length-1) return 1;
		if(row >= arr.length || col >= arr[0].length) 	return 0;
		return count(arr, row, col+1) + count(arr, row+1, col);
	}

}
