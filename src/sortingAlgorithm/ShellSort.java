package sortingAlgorithm;


/**
 * @author charles
 * 希尔排序
 * 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * 按增量序列个数k，对序列进行k 趟排序；
 * 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。
       仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 */
public class ShellSort {

	private static ShellSort instance;

	private ShellSort() {
		// TODO Auto-generated constructor stub
	}

	public static ShellSort getInstance() {
		if (instance == null) {
			synchronized (ShellSort.class) {
				if (instance == null) {
					instance = new ShellSort();
				}
			}
		}
		return instance;
	}

	public void sort(int[] nums) {
		int len = nums.length;
	    for (int gap = (int) Math.floor(len / 2); gap > 0; gap = (int) Math.floor(gap / 2)) {
	        // 注意：这里和动图演示的不一样，动图是分组执行，实际操作是多个分组交替执行
	        for (int i = gap; i < len; i++) {
	        	int j = i; 
	        	int current = nums[i];
	            while (j - gap >= 0 && current < nums[j - gap]) {
	            	nums[j] = nums[j - gap];
	                 j = j - gap;
	            }
	            nums[j] = current;
	        }
	    }
	    
	}
	
}
