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
		// ð������
//		int[] args = BubbleSort.getInstance().sort(nums);
		
		
		// ѡ������
//		int[] args = SelectSort.getInstance().sort(nums);
		
		// ��������
//		ShellSort.getInstance().sort(nums);
		
		// �鲢����
//		int[] args = MergeSort.getInstance().sort(nums);
		
		// ��������
//		QuickSort.getInstance().sort(nums, 0, numsLength-1);
		
		// ������
//		HeapSort.getInstance().heapSort(nums);
		
		// ��������
//		CountingSort.getInstance().sort(nums);
		
		// Ͱ����
//		BucketSort.getInstance().sort(nums);
		
		// ��������
		RadixSort.getInstance().sort(nums);
		for(int arg:nums){
			System.out.print(arg+" ");
		}
	}
	
}
