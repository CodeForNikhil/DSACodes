package linkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(40);
		ll.insertFirst(30);
		ll.insertFirst(50);
		ll.display();
		System.out.println();
		System.out.println();
		ll.insertLast(70);
		ll.display();
		System.out.println();
		ll.deleteFirst();
		System.out.println();
		ll.display();
		ll.deleteFirst();
		System.out.println();
		ll.display();
		System.out.println();
		ll.insertAtPos(5, 2);
		ll.display();
		System.out.println();
		ll.insertAtPos(6, 5);
		ll.display();
		System.out.println();
		ll.deleteAtPos(3);
		ll.display();
		System.out.println();
		ll.circular();
		ll.displayCircular(10);
	}

}
