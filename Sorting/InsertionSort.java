package Sorting;

public class InsertionSort {
	
	public static void insertionSort(int arr[]) {
		for(int i = 1; i < arr.length;i++) {
			int j = i-1;
			int val = arr[i];
			while(j>=0 && val < arr[j]) {
				arr[j+1] = arr[j--];
			}
			arr[++j] = val;
		}
	}
	
	public static void printData(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {87,66,56,73,45,23};
		
		insertionSort(arr);
		printData(arr);
	}

}
