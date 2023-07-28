package Sorting;

public class SelectionSort {

	public static void selectionSort(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			int minIndex = i;
			for(int j= i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
		
		public static void display(int arr[]) {
			for(int i = 0; i < arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
		public static void main(String[] args) {
			int arr[] = {44,39,60,43,23,55};
			selectionSort(arr);
			display(arr);
			
		}
	}
