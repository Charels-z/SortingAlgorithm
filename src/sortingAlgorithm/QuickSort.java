package sortingAlgorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author charles
 * 快速排序
 *
 */
public class QuickSort {
	private static QuickSort instance;
	private QuickSort(){
		
	}
	public static QuickSort getInstance(){
		if(instance == null){
			synchronized (QuickSort.class) {
				if (instance == null) {
					instance = new QuickSort();
				}
			}
		}
		return instance;
	}
	public void sort(int[] arr,int low, int high) {
		int i, j ,temp,snap;
		if(low > high){
			return;
		}
		i = low;
		j = high;
		// 基准位置
		temp = arr[low];
		while (i<j) {
			while (temp<=arr[j] && i<j) {
				j--;
			}
			while (temp>=arr[i] && i<j) {
				i++;
			}
			if (i<j) {
				// 交换满足条件的 i j位置的值
				snap = arr[i];
				arr[i] = arr[j];
				arr[j] = snap;
			}
		}
		// 交换基准位置的值
		arr[low] = arr[i];
		arr[i] = temp;
		
		// 递归调用, 左右
		sort(arr,low,j-1);
		sort(arr,j+1,high);
	}
	
}
