package com.huihuilove.study.arithmetic.sort;

/**
 * 冒泡排序
 * 基本思想：
 * 		1.遍历数组的同时比较相邻元素大小，通过交换操作将极值移动到某一侧 	(每次遍历时未确定位置的元素中的极大值或极小值)
 * 		2.每次遍历可以保证确定一个元素的位置，使得每次需要遍历的元素减一
 * 
 * 时间复杂度：O(n*n)
 * 空间复杂度：O(1)
 * 稳定度：稳定
 * @author 陈威
 *
 */
public class BubbleSort {

	/**
	 * 冒泡排序 - 1.1 - 基本算法
	 * 实现从小到大排序
	 * @param arr
	 */
	public static void sort(int[] arr){
		for(int j = 0;j < arr.length - 1;j++){
			for(int i = 0; i < arr.length - j - 1;i++){
				if(arr[i] > arr[i + 1]){
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
			printArr(arr);
		}
	}
	/**
	 * 冒泡排序 - 1.2 - 基本算法
	 * 实现从大到小，在1.1基础上修改比较语句即可
	 * @param arr
	 */
	public static void sortRevers(int[] arr){
		for(int j = 0;j < arr.length  ;j++){
			for(int i = 0; i < arr.length - j - 1;i++){
				if(arr[i] < arr[i + 1]){		//modifaction
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
			printArr(arr);
		}
	}
	
	/**
	 * 冒泡排序 - 2 - 改进算法
	 * 设置标志位。每一轮遍历后判断是否发生交换，没有交换则提前退出
	 * @param arr
	 */
	public static void sort2(int[] arr){
		
		int j = 0;
		boolean isSwap = true;//是否发生交换
		
		do{
			isSwap = true;//每一轮开始标志置为true
			for(int i = 0; i < arr.length - j - 1;i++){
				if(arr[i] > arr[i + 1]){
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					isSwap = false;//如果发生交换则标志置为 false;
				}
			}
			j++;
			printArr(arr);
		}while(!isSwap);
		
	}
	
	public static void printArr(int[] arr){
		for(int i : arr){
			System.out.print(i + ",");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] arr = {5,4,3,2,1};
		sort(arr);
		System.out.println("排序完成");
	}
	
}
