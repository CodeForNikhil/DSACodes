package Queue;

public class QueueLL {
	
	Node front;
	Node rear;
	Node temp;
	static int count = 0;

	public QueueLL() {}
	
	public void enqueue(int val) {
		Node n = new Node (val);
		if(front==null) {
			front = rear = n;
		}
		else {
			temp = front;
			rear.next=n;
			rear = n;
		}
	}
	
	public void dequeue() {
		int x = -1;
		if(front == null) {
			System.out.println("Queue is empty");
		}
		else {
			x = front.value;
			temp = front;
			temp = temp.next;
		}
		System.out.println("Element deleted is: "+x);
	}
	
	public void display() {
		while(temp.next!=null) {
			System.out.print(temp.value+"-> ");
			temp = temp.next;
		}
		System.out.print(temp.value+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLL q = new QueueLL();
		
		q.enqueue(10);
		q.enqueue(7);
		q.enqueue(90);
		q.display();

	}

}
