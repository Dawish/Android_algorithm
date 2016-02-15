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
		 /*
		  * 第一个作为本来就有的数据，第二个作为插入的数据
		  */
		 for (outer = 1; outer < arr.length; outer++){ 
		        //current sort value
		        int temp = arr[outer];
		        inner = outer;
		        //move range right 
		        while (inner > 0 && arr[inner - 1] >= temp)  //前面的大就想后面移动
		        {
		            arr[inner] = arr[inner - 1];
		            --inner;
		        }
		        arr[inner] = temp;
		        
		        System.out.print("第"+outer+"次循环后的结果:");
		        for(int i:arr){
					System.out.print(i+"   ");
				}
		        System.out.println("");
		    }
		
		return arr;
	}
	
}
