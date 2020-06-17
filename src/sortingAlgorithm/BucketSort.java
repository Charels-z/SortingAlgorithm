package sortingAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 桶排序
 * @author charles
 *
 */
public class BucketSort {
	private static BucketSort instance;

	private BucketSort() {
		
	}
	public static BucketSort getInstance(){
		if(instance == null){
			synchronized (BucketSort.class) {
				if (instance == null) {
					instance = new BucketSort();
				}
			}
		}
		return instance;
	}
	public void sort(int[] nums) {
		int min = nums[0],max = nums[0];
		for(int num: nums){
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		int bucketBottom = (int) Math.floor((float)min/10);
		int bucketTop = (int) Math.ceil((float)max/10);
		ArrayList<ArrayList<Integer>> bucketsList = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i<(bucketTop-bucketBottom);i++){
			bucketsList.add(new ArrayList<Integer>());
		}
		for(int num: nums){
			int index = getBucketIndex(num);
			insertBucket(bucketsList.get(index),num);
		}
		int index = 0;
		for (ArrayList<Integer> list : bucketsList) {
			for(int data: list){
				nums[index++] = data;
			}
		}
	}
	
	// 将数据放入具体的桶内
	private void insertBucket(ArrayList<Integer> arrayList, int num) {
		boolean insertFlag = true;
		ListIterator<Integer> it = arrayList.listIterator();
		while (it.hasNext()) {
			if (num <= it.next()) {
				it.previous(); // 把迭代器的位置偏移回上一个位置
				it.add(num); // 把数据插入到迭代器的当前位置
				insertFlag = false;
				break;
			}
		}
		// 否则把数据插入到链表末端
		if (insertFlag) {
			arrayList.add(num); 
		}
	}
	// 判断放入哪个桶内的方法
	private int getBucketIndex(int data){
		return (int) Math.floor(data/10);
	}
}
