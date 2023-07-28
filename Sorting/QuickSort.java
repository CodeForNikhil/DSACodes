package Sorting;

public class QuickSort {
	public static int partitionData(int arr[], int l, int h) {
		int pivot = arr[h];
		int j = h-1;
		int i = 0;
		while(i<=j) {
			if(arr[i]>pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
				j--;
			}
			else {
				i++;
			}
		}
		arr[h] = arr[j+1];
		arr[j+1] = pivot;
		
		return j+1;
	}

	public static void quickSort(int arr[],int l, int h) {
		if(l<h) {
			int p = partitionData(arr, l, h);
			if(p!=-1) {
				quickSort(arr, l, p-1);
				quickSort(arr, p+1, h);
			}
		}
	}
	
	public static void display(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,99,87,34,52,44,36};
		quickSort(arr, 0, arr.length-1);
		display(arr);
	}

}
