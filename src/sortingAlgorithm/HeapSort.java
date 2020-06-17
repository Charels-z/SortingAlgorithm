package sortingAlgorithm;

/**
 * 
 * @author charles
 * ∂—≈≈–Ú
 */
public class HeapSort {
	private static HeapSort instance;

	private HeapSort() {
		// TODO Auto-generated constructor stub
	}

	public static HeapSort getInstance() {
		if (instance == null) {
			synchronized (HeapSort.class) {
				if (instance == null) {
					instance = new HeapSort();
				}
			}
		}
		return instance;
	}
	
//	public void sort(int[] nums) {
//	}
	
	public static void sort(int[] array) {
		if (array == null || array.length <= 1) {
			return;
		}
		buildMaxHeap(array);

		int temp;
		for(int arg:array){
			System.out.print(arg+" ");
		}
		for (int i = array.length - 1; i >= 1; i--) {

			temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			maxHeap(array, i, 0);
			System.out.println(" ");
			System.out.println("-------"+i+"-------");
			for(int arg:array){
				System.out.print(arg+" ");
			}
		}
	}

	private static void buildMaxHeap(int[] array) {
		if (array == null || array.length <= 1) {
			return;
		}

		int half = array.length / 2;
		for (int i = half; i >= 0; i--) {
			maxHeap(array, array.length, i);
		}
	}

	private static void maxHeap(int[] array, int heapSize, int index) {
		int left = index * 2 + 1;
		int right = index * 2 + 2;
		int largest = index;
		if (left < heapSize && array[left] > array[index]) {
			largest = left;
		}

		if (right < heapSize && array[right] > array[largest]) {
			largest = right;
		}

		if (index != largest) {

			int temp;
			temp = array[index];
			array[index] = array[largest];
			array[largest] = temp;
			
			maxHeap(array, heapSize, largest);
		}
	}
	

}
