package Sorting;

public class MergeSort {

	public static void mergeSort(int arr[], int l, int h) {
		if (l < h) {
			int mid = (l + h) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, h);
			merge(arr, l, mid, h);
		}
	}

	public static void merge( int arr[], int l, int m, int h) {
		int n1,n2;
		n1 = m-l+1;
		n2=h-m;
		
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		
		for(int i = 0; i<n1;i++) {
			a1[i] = arr[l+i];
		}
		
		for (int i = 0; i < n2; i++) {
			a2[i] = arr[m+1+i];
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while(i<n1 && j<n2) {
			if(a1[i] < a2[j]) {
			arr[k++]=a1[i++];
			}
			else {
				arr[k++] = a2[j++];
			}
		}
		
		while(i<n1) {
			arr[k++]=a1[i++];
		}
		while(j<n2) {
			arr[k++] = a2[j++];
		}
	}

	public static void display(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,7,5,3,2,55,6,99};
		mergeSort(arr, 0, arr.length-1);
		display(arr);
	}

}
