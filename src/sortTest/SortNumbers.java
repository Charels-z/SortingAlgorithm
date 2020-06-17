package sortTest;

import sortingAlgorithm.RadixSort;

/**
 * 
 * @author Administrator
 *
 */
public class SortNumbers {

	public static void main(String[] args){
		test();
	}

	private static void test() {
		// TODO Auto-generated method stub
//		int numsLength =45;
		int numsLength = (int) (Math.random()*50+51);
		int[] nums = new int[numsLength];
		for(int i=0;i<nums.length;i++){
			nums[i] =  (int) (Math.random()*1000);
		}
//		int[] nums = {1,4,5,2,3};
		// Ã°ÅÝÅÅÐò
//		int[] args = BubbleSort.getInstance().sort(nums);
		
		
		// Ñ¡ÔñÅÅÐò
//		int[] args = SelectSort.getInstance().sort(nums);
		
		// ²åÈëÅÅÐò
//		ShellSort.getInstance().sort(nums);
		
		// ¹é²¢ÅÅÐò
//		int[] args = MergeSort.getInstance().sort(nums);
		
		// ¿ìËÙÅÅÐò
//		QuickSort.getInstance().sort(nums, 0, numsLength-1);
		
		// ¶ÑÅÅÐò
//		HeapSort.getInstance().heapSort(nums);
		
		// ¼ÆÊýÅÅÐò
//		CountingSort.getInstance().sort(nums);
		
		// Í°ÅÅÐò
//		BucketSort.getInstance().sort(nums);
		
		// »ùÊýÅÅÐò
		RadixSort.getInstance().sort(nums);
		for(int arg:nums){
			System.out.print(arg+" ");
		}
	}
	
}
