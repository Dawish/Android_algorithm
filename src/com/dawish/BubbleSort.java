package com.dawish;

/**
 * java实现冒泡排序
 * 从小到大排序
 * @author Danxx
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int score[] = { 5,3,8,6,2,7  };
		for (int i = 0; i < score.length - 1; i++) { // 最多做n-1趟排序
			for (int j = 0; j < score.length - i - 1; j++) { // 对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
				if (score[j] > score[j + 1]) { // 把大的值交换到后面
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
			System.out.print("第" + (i + 1) + "次排序结果：");
			for (int a = 0; a < score.length; a++) {
				System.out.print(score[a] + "\t");
			}
			System.out.println("");
		}
		System.out.print("最终排序结果：");
		for (int a = 0; a < score.length; a++) {
			System.out.print(score[a] + "\t");
		}
	}

	
	
	
}