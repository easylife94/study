package com.huihuilove.study.arithmetic.sort;
/**
 * 希尔排序
 * 结合了直接插入排序和缩小增量的思想。
 * 因为直接插入排序在数组元素基本有序情况下效率较高，将数组逻辑上分为数个长度相等的数组，然后对每个数组（缩小后的数组）进行直接插入排序。
 * 然后减少数组数量增大每个数组的元素个数再进行直接插入排序，直到最后增量为1只剩下一个数组也就是原数组后对所有元素进行直接插入排序。
 * 
 * 分割数组的方式 - 跳格子
 * 从第一个元素开始跳 step(增量)个格子后的
 * 数组arr = {1,2,3,4,5,6}。分割为3组后
 * {1,4}
 * {2,5}
 * {3,6}
 * 增量 - 分割后数组中每个元素在原数组中间隔长度也是分割的数组数量。
 * 
 * @author 陈威
 *
 */
public class ShellSort {
	
	public static void sort(int[] arr){
		int n = arr.length;
		for(int step = n / 2;step > 0; step /= 2 ){
			for(int i = 0;i < step;i++){//遍历分组,对每个分组使用直接插入排序
				
				//////////////////////直接插入排序
				for(int j = i + step;j < n ;j += step ){
					for(int k = j; k > i && arr[k] < arr[k - step]; k -= step){
						int tmp = arr[k];
						arr[k] = arr[k - step];
						arr[k - step] = tmp;
					}
				}
				//////////////////////直接插入排序
				
				
			}
		}
	}
	public static void printArr(int[] arr){
		for(int i : arr){
			System.out.print(i + ",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {6,5,4,3,2,1,5,3,8,1,0,6,3,7,3};
		sort(arr);
		printArr(arr);
	}
}
