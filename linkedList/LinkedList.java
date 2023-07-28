package linkedList;

public class LinkedList {
	int data;
	Node head;
	Node tail;
	Node temp;
	int size = 0;
	
	
	public LinkedList() {
		super();
	}

	public void insertFirst(int val) {
		Node n = new Node(val);
		n.next = head;
		head = n;
		
		if(tail==null) {
			tail = head;
		}
		size+=1;
	}
	
	public void display() {
		temp = head;
		while(temp!=null) {
			System.out.print(temp.value+"-> ");
			temp = temp.next;
		}
		System.out.print("done");
	}
	
	public void insertLast(int val) {
		if(tail==null) {
			insertFirst(val);
			return;
		}
		Node n = new Node(val);
		tail.next = n;
		tail = n;
		size+=1;
	}
	
	public void deleteFirst() {
		temp = head;
		if(temp!=null) {
			head = temp.next;
		}
		else
			temp = null;
		size-=1;
	}
	
	public void insertAtPos(int val, int pos) {
		
		temp = head;
		int cnt = 1;
		if(pos==0) {
			insertFirst(val);
		}
		else {
			while(cnt<pos-1) {
				temp = temp.next;
				cnt++;
			}
		Node insert = new Node(val);
		insert.next = temp.next;
		temp.next = insert;
		}
	}
	
	public void deleteAtPos(int pos) {
		temp = head;
		if(pos==0){
			deleteFirst();
		}else {
			Node prev = null;
			int cnt = 1;
			while(cnt<=pos) {
				prev = temp;
				temp = temp.next;
				cnt++;
			}
			prev.next = temp.next;
		}
	}
	public void circular() {
		temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = head;
	}
	
	public void displayCircular(int n) {
		temp = head;
		for(int i=1; i<n;i++) {
			System.out.print(temp.value+"-> ");
			temp = temp.next;
		}
		System.out.print(temp.value+" done");
	}
}

