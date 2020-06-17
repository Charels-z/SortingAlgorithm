package sortingAlgorithm;

/**
 * 
 * @author charles
 * —°‘Ò≈≈–Ú
 *
 */
public class MergeSort {
	private static MergeSort instance;
	private MergeSort(){
		
	}
	public static MergeSort getInstance(){
		if(instance == null){
			synchronized (MergeSort.class) {
				if (instance == null) {
					instance = new MergeSort();
				}
			}
		}
		return instance;
	}
	
	public int[] sort(int[] nums) {
		int len = nums.length;
		if(len<2){
			return nums;
		}
		int middle = (int) Math.floor(len/2);
		int[] left = new int[middle],right = new int[len-middle];
		System.arraycopy(nums, 0, left, 0, middle);
		System.arraycopy(nums, middle, right, 0, len-middle);
		return merge(sort(left),sort(right));
	}
	
	private int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		  int[] result = new int[left.length+right.length];
		  int i = 0, j = 0, k = 0;
		    while ((left.length - j) > 0 && (right.length - k) > 0) {
		        if (left[j] <= right[k]) {
		            result[i] = left[j];
		            j++;
		        } else {
		        	result[i] = right[k];
		        	k++;
		        }
		        i++;
		    }
		    while (j < left.length){
		    	System.arraycopy(left, j, result, i, left.length-j);
		    	j++;
		    	i++;
		    }
		        
		    while (k < right.length){
		    	System.arraycopy(right, k, result, i, right.length-k);
		    	k++;
		    	i++;
		    }
		    return result;
	}
}
