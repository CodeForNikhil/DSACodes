package Trees;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Tree {

	private Node root;
	
	public Tree() {}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public boolean insert(int val) {
		Node n = new Node(val);
		if(n==null) {
			return false;
		}
		if(root == null) {
			root = n;
			return true;
		}
		Node t = root;
		Node par;
		while(t!=null) {
			par = t;
			if(val > t.getData()) {
				t = t.getRchild();
			}else {
				t = t.getLchild();
			}
			if(t==null) {
				if(val>par.getData()) {
					par.setRchild(n);
				}
				else {
					par.setLchild(n);
				}
			}
		}
		return true;
	}
	
	public void inOrder(Node t) {
		//using recursion
		
		if (t == null)
			return;
		inOrder(t.getLchild());
		System.out.print("  " + t.getData());
		inOrder(t.getRchild());
	}
	
	public void preOrder() {
	//using Node stack arrays
		
		Node st[] = new Node[40];
		int top = -1;
		Node t = root;
		while(t!=null || top!=-1) {
			while(t!=null) {
				System.out.println(t.getData()+" ");
				st[++top] = t;
				t=t.getLchild();
			}
			t=st[top--];
			t=t.getRchild();
		}
	}
	
	public void inOrder(){
		//using Node stack arrays
		Node st[]=new Node[50];
		int top=-1;
		Node t=root;
		//stk[++top]=root;
		while(t!=null||top!=-1) {
			while(t!=null) {
				st[++top]=t;
				t=t.getLchild();				
			}
			t=st[top--];
			System.out.print(t.getData()+"  ");
			t=t.getRchild();
		}	
	}
	
	public void inOrderUsingStack() {
		Stack<Node> st= new Stack<>();
		Node t = root;
		while(t!=null || !st.isEmpty()) {
			while(t!=null) {
				st.push(t);
				t = t.getLchild();
			}
			t=st.pop();
			System.out.println(t.getData()+" ");
			t=t.getRchild();
		}
	}
	
	public void postOrderUsingNode(Node root) {
		//LRN - Left, Right, Node
		Node temp = root;
		if(temp!=null) {
			postOrderUsingNode(temp.getLchild());
			postOrderUsingNode(temp.getRchild());
			System.out.print(temp.getData()+" ");
		}
	}
	
	public void inOrderUsingNode(Node root) {
		//LNR - Left, Node, Right
		Node temp = root;
		if(temp!=null) {
			preOrderUsingNode(temp.getLchild());
			System.out.print(temp.getData()+" ");
			preOrderUsingNode(temp.getRchild());
		}
	}
	
	public void preOrderUsingNode(Node root) {
		//NLR - Node,left,right
		Node temp = root;
		if(temp!=null) {
			System.out.print(temp.getData()+" ");
			preOrderUsingNode(temp.getLchild());
			preOrderUsingNode(temp.getRchild());
		}
	}
	
	public void bfs() {
		Queue<Node> q=new ConcurrentLinkedQueue<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node t=q.remove();
			System.out.print("  " + t.getData());
			if(t.getLchild()!=null)
				q.add(t.getLchild());
			if(t.getRchild()!=null)
				q.add(t.getRchild());
		}
	}
	
	public boolean delete(int v) {
		if (root == null) {
			System.out.println("Null Tree");
			return false;
		}

		Node t = root, par = t;
		while (true) {
			while (t.getData() != v) {
				par = t;
				if (t.getData() > v)
					t = t.getLchild();
				else
					t = t.getRchild();
			}
			// case 1- deleting terminal node
			if (t.getLchild() == null && t.getRchild() == null) {
				if (par.getLchild() == t)
					par.setLchild(null);
				else
					par.setRchild(null);
				return true;
			}
			if (t.getLchild() != null) {
				Node max = t.getLchild();
				par = max;
				while (max.getRchild() != null) {
					par = max;
					max = max.getRchild();
				}
				int t1 = t.getData();
				t.setData(max.getData());
				max.setData(t1);
				t = max;
			} else {
				Node min = t.getRchild();
				par = min;
				while (min.getLchild() != null) {
					par = min;
					min = min.getLchild();
				}
				int t1 = t.getData();
				t.setData(min.getData());
				min.setData(t1);
				t = min;

			}
		}
	}
	
	public static void heapSort(int arr[]) {
		int n = arr.length;
		for(int i = n-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr,i,0);
		}
		
	}
	
	private static void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left<n && arr[left] > arr[largest]) {
			largest = left;
		}
		if(right<n && arr[right]> arr[largest]) {
			largest = right;
		}
		if(largest!=i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, n, largest);
		}
	}
}
