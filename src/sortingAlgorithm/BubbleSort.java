package sortingAlgorithm;


/**
 * @author charles
 * Ã°ÅÝÅÅÐò
 *
 */
public class BubbleSort {

	private static BubbleSort instance;

	private BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public static BubbleSort getInstance() {
		if (instance == null) {
			synchronized (BubbleSort.class) {
				if (instance == null) {
					instance = new BubbleSort();
				}
			}
		}
		return instance;
	}

	public void sort(int[] nums) {
		for(int i = 0;i<nums.length -1;i++){
			for (int j = 0; j < nums.length - 1-i; j++) {
				int c;
				if (nums[j] > nums[j + 1]) {
					c = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = c;
				}
			}
		}
	}
	
	// ¸Ä½øËã·¨
	public void bubbleSort(int arr[]) {
	    boolean didSwap;
	    for(int i = 0, len = arr.length; i < len - 1; i++) {
	        didSwap = false;
	        for(int j = 0; j < len - i - 1; j++) {
	            if(arr[j + 1] < arr[j]) {
	            	int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
	                didSwap = true;
	            }
	        }
	        if(didSwap == false)
	            return;
	    }
	}

}
