package sortingAlgorithm;

/**
 * 
 * @author charles
 * —°‘Ò≈≈–Ú
 *
 */
public class SelectSort {
	private static SelectSort instance;
	private SelectSort(){
		
	}
	public static SelectSort getInstance(){
		if(instance == null){
			synchronized (SelectSort.class) {
				if (instance == null) {
					instance = new SelectSort();
				}
			}
		}
		return instance;
	}
	public int[] sort(int[] nums) {
		int len = nums.length;
		int temp;
		for(int i = 0;i<len;i++){
			for(int j =i;j<len;j++){
				if(nums[i]>nums[j]){
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
}
