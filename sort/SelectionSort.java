package sort;

public class SelectionSort {
	public static void main(String[] args){
		int[] a = {4,5,6,3,2,1};
		selectionSort(a, a.length);
		for(int num: a){
			System.out.print(num+" ");
		}
	}
	
	public static void selectionSort(int[] a, int n){
		if(n <= 1) return;
		for(int i=0; i<n-1; ++i){
			int min = i; //查找最小值
			for(int j = i+1; j<n; ++j){
				if(a[j] < a[min]){
					min = j;
				}
			}
			//交换
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}
}
