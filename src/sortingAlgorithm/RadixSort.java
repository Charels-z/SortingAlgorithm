package sortingAlgorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 桶排序
 * @author charles
 *
 */
public class RadixSort {
	private static RadixSort instance;

	private RadixSort() {
		
	}
	public static RadixSort getInstance(){
		if(instance == null){
			synchronized (RadixSort.class) {
				if (instance == null) {
					instance = new RadixSort();
				}
			}
		}
		return instance;
	}
	public void sort(int[] nums) {
		 int max = 0;
		 int exp = 1;
		 for (int num:nums){
			 max = Math.max(max,num);
		 }
		 while(max/Math.pow(10,exp) > 1){
			 exp++;
		 }
		//存储待排元素
		 ArrayList<ArrayList<Integer>> radixList = new ArrayList<ArrayList<Integer>>();
		 for(int j = 0;j<10;j++){
			 ArrayList<Integer> list = new ArrayList<Integer>();
			 radixList.add(list);
		 }
		 
		 for(int i = 0;i<=exp;i++){
			 for(int num:nums){
				 int positionValue = getPositionValue(num, i);
				 radixList.get(positionValue).add(num);
			 }
			 int index = 0;
			 for(ArrayList<Integer> list:radixList){
				 for(int value: list){
					 nums[index] = value;
					 index++;
				 }
				 list.clear();
			 }
		 }
	}
	// 获取当前位数对应的值
	private int getPositionValue(int num,int exp){
		return (int) (num % Math.pow(10, exp)/Math.pow(10, exp-1));
	}
}
