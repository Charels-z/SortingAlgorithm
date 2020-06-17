package sortingAlgorithm;

/**
 * Ó‹”µÅÅĞò
 * @author charles
 *
 */
public class CountingSort {
	private static CountingSort instance;

	private CountingSort() {
		
	}
	public static CountingSort getInstance(){
		if(instance == null){
			synchronized (CountingSort.class) {
				if (instance == null) {
					instance = new CountingSort();
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
		int[] counts = new int[max - min+1];
		for(int num: nums){
			counts[num - min]++;
		}
		int i = 0,j = 0;
		for(int count:counts){
			while (count > 0) {
				nums[i] = j + min;
				count --;
				i ++;
			}
			j++;
		}
	}
}
