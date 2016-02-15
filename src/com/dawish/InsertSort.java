package com.dawish;
/**
 * 插入排序
 * @author Danxx
 *
 */
public class InsertSort {
	
	public static void main(String[] args) {
		
		int[] arr = {7,2,9,3,5,4};
		
		arr = InsertSort.sort(arr);
		
		for(int i:arr){
			System.out.print(i+"   ");
		}
	}
	
	static int[] sort(int[] arr){
		
		 int outer, inner;
		 for (outer = 1; outer < arr.length; outer++){
		        //current sort value
		        int temp = arr[outer];
		        inner = outer;
		        //move range right
		        while (inner > 0 && arr[inner - 1] >= temp)
		        {
		            arr[inner] = arr[inner - 1];
		            --inner;
		        }
		        arr[inner] = temp;

		    }
		
		return arr;
	}
	
}
