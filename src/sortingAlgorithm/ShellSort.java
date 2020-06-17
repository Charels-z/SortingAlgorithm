package sortingAlgorithm;


/**
 * @author charles
 * ϣ������
 * ѡ��һ����������t1��t2������tk������ti>tj��tk=1��
 * ���������и���k�������н���k ������
 * ÿ�����򣬸��ݶ�Ӧ������ti�����������зָ�����ɳ���Ϊm �������У��ֱ�Ը��ӱ����ֱ�Ӳ�������
       ����������Ϊ1 ʱ������������Ϊһ�������������ȼ�Ϊ�������еĳ��ȡ�
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
	        // ע�⣺����Ͷ�ͼ��ʾ�Ĳ�һ������ͼ�Ƿ���ִ�У�ʵ�ʲ����Ƕ�����齻��ִ��
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
