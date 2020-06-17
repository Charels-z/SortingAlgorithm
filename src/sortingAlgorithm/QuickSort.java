package sortingAlgorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author charles
 * ��������
 *
 */
public class QuickSort {
	private static QuickSort instance;
	private QuickSort(){
		
	}
	public static QuickSort getInstance(){
		if(instance == null){
			synchronized (QuickSort.class) {
				if (instance == null) {
					instance = new QuickSort();
				}
			}
		}
		return instance;
	}
	public void sort(int[] arr,int low, int high) {
		int i, j ,temp,snap;
		if(low > high){
			return;
		}
		i = low;
		j = high;
		// ��׼λ��
		temp = arr[low];
		while (i<j) {
			while (temp<=arr[j] && i<j) {
				j--;
			}
			while (temp>=arr[i] && i<j) {
				i++;
			}
			if (i<j) {
				// �������������� i jλ�õ�ֵ
				snap = arr[i];
				arr[i] = arr[j];
				arr[j] = snap;
			}
		}
		// ������׼λ�õ�ֵ
		arr[low] = arr[i];
		arr[i] = temp;
		
		// �ݹ����, ����
		sort(arr,low,j-1);
		sort(arr,j+1,high);
	}
	
}
