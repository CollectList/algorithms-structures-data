package sort;

public class InsertionSort {
	
	public static void main(String[] args){
		int[] a = {4,5,6,3,2,1};
		insertionSort(a, a.length);
		for(int num: a){
			System.out.print(num+" ");
		}
	}
	
	public static void insertionSort(int[] a, int n){
		if(n <= 1) return;
		
		for(int i=1; i<n; ++i){
			int value = a[i];
			int j = i-1;
			for(;j>=0;--j){
				if(a[j] > value){
					a[j+1] = a[j]; //数据移动
				} else {
					break;
				}
			}
			a[j+1] = value; //插入数据
		}
	}

}
