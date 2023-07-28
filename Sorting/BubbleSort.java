package Sorting;

public class BubbleSort {
	
	public static void bubbleSort(int arr[]) {
		int temp;
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void display(int arr[]) {
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {12,10,7,15,6,33};
		
		bubbleSort(arr);
		display(arr);
	}
}
