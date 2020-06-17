package sortingAlgorithm;

/**
 * ≤Â»Î≈≈–Ú
 * @author charles
 *
 */
public class InsertSort {
	private static InsertSort instance;

	private InsertSort() {
		// TODO Auto-generated constructor stub
	}

	public static InsertSort getInstance() {
		if (instance == null) {
			synchronized (InsertSort.class) {
				if (instance == null) {
					instance = new InsertSort();
				}
			}
		}
		return instance;
	}
	
	public void sort(int[] nums) {
		int len = nums.length;
		int preIndex,current;
		for(int i = 0;i<len;i++){
			preIndex = i - 1;
			current = nums[i];
			while(preIndex >= 0 && nums[preIndex] > current){
				nums[preIndex + 1] = nums[preIndex];
	            preIndex--;
			}
			nums[preIndex + 1] = current;
		}
	}
}
