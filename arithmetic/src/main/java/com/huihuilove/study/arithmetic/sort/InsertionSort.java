package com.huihuilove.study.arithmetic.sort;
/**
 * 插入排序
 * 基本思想：
 * 		1.将数组分为有序和无序两部分,一开始以第一个元素为有序部分,其余的为无序部分。
 * 		2.从无序部分开始遍历,取出元素在有序部分找到正确位置后插入,此位置原有的元素和其后的元素后移。
 * 
 * 时间复杂度：O(n*n)
 * 空间复杂度：O(1)
 * 稳定度：稳定
 * @author 陈威
 *
 */
public class InsertionSort {
	
	/**
	 * 插入排序 - 1 - 基本步骤
	 * @param arr
	 */
	public static void sort(int[] arr){
		int n = arr.length;
		for(int i = 1; i < n;i++){		//此循环遍历无序部分，从第二个元素开始
			for(int j = 0; j < i;j++){	//此循环遍历有序部分，无序元素在有序部分查找插入位置
				
				if(arr[i] < arr[j]){	//比较无序元素和有序元素，寻找插入位置j
					int tmp = arr[i];
					
					//将(j,i]区间 中的的元素后移 
					for(int k = i;k > j; k--){
						arr[k] = arr[k - 1];
					}
					arr[j] = tmp;//插入元素
					break;//插入后退出
				}
			}
			printArr(arr);
		}
	}
	/**
	 * 插入排序 - 2 - 改进移动数组动作
	 * 从待排序元素开始往前搜索插入位置的同时交换待排序元素和被比较元素，使得待插入元素一直往插入位置靠近而不需要额外遍历操作来移动数组
	 * @param arr
	 */
	public static void sort2(int[] arr){
		int n = arr.length;
		for(int i = 1;i < n;i++){
			for(int j = i;j > 0 && arr[j] < arr[j-1];j--){//从待排序元素开始往前搜索插入位置的同时交换位置-实现了数组后移
				int tmp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = tmp;
			}
			printArr(arr);
		}
	}
	
	public static void printArr(int[] arr){
		for(int i : arr){
			System.out.print(i + ",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {6,5,4,3,2,1,3,6,4,9,1,3,9,0};
		sort2(arr);
		
	}
}
