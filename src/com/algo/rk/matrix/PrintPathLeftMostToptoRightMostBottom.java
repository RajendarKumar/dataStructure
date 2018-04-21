package com.algo.rk.matrix;

/**
 http://www.geeksforgeeks.org/print-all-possible-paths-from-top-left-to-bottom-right-of-a-mxn-matrix/
 */
public class PrintPathLeftMostToptoRightMostBottom {

/**
 * <p>print all paths from top left most cell to bottom right most cell in mXn matrix.<p>
 * @param arr
 * @param row
 * @param col
 * @param result
 * @param pos
 */
    public static void print(int arr[][],int row, int col,int result[],int pos){
        if(row == arr.length-1 && col == arr[0].length-1){
            result[pos] = arr[row][col];
            for (int i : result) {
            	System.out.print(i +" ");
			}
            System.out.println();
            return;
        }
        if(row >= arr.length || col >= arr[0].length) return;

        result[pos] = arr[row][col];
        print(arr,row,col+1,result,pos+1);
        print(arr,row+1,col,result,pos+1);
    }
    
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{9,10,11,12}};
        int result[] = new int[arr.length + arr[0].length-1];//total element in path
        print(arr, 0, 0, result,0);
    }
}