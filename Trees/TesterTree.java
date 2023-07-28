package Trees;

public class TesterTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		
		t.insert(30);
		t.insert(76);
		t.insert(25);
		t.insert(38);
		t.insert(55);	
		t.insert(35);
		t.insert(95);
		t.insert(65);
		t.insert(62);
		t.insert(39);
		
		System.out.println("Inorder with recursion: ");
		t.inOrder(t.getRoot());
		System.out.println();
		t.inOrder();
		System.out.println();
		System.out.println("Postorder with recursion: ");
		t.postOrderUsingNode(t.getRoot());
		System.out.println();
		System.out.println("BFS: ");
		t.bfs();
		System.out.println();
		int arr[] = {50,30,40,20,55,90};
		t.heapSort(arr);
		for(int i=0; i< arr.length;i++)
		System.out.print(arr[i]+" ");
	}

}
