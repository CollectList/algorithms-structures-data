package sort;

public class BubbleSort {
	
	public static void main(String[] args){
		int[] a = {4,5,6,3,2,1};
		bubbleSort(a, a.length);
		for(int num: a){
			System.out.print(num+" ");
		}
		
	}
	
	public static void bubbleSort(int[] a, int n){
		if(n <= 1) return;
		
		for(int i = 0; i < n ; ++i){
			boolean flag = false;
			for(int j = 0; j < n-i-1; ++j){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if(!flag) break;
		}
	}
}
