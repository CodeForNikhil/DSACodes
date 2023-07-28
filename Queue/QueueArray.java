package Queue;

public class QueueArray {
	int Q[];
	int f,r,size;
	
	public QueueArray() {}
	
	public QueueArray(int size) {
		this.size = size;
		Q = new int [size];
		f=r=-1;
	}
	
	
	public int getf() {
		return f;
	}

	public void setf(int f) {
		this.f = f;
	}

	public int getr() {
		return r;
	}

	public void setr(int r) {
		this.r = r;
	}

	public boolean isFull() {
		if(r==Q.length-1) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int val) {
	if(isFull()) {
		System.out.println("Queue is full");
	}
	if(r==-1) {
		f=0;
		}
		Q[++r] = val;
	}
	
	public void dequeue() {
		int x = -1;
		if( f==r) {
			System.out.println("Queue is Empty");
		}
		else {
			x = Q[f];
			f++;
		}
		System.out.println("Deleted element is: "+x);
	}
	
	public void display() {
		System.out.print("Elements: ");
		for(int i=f; i<=r; i++) {
			System.out.print(" "+Q[i]);
		}
	}
	
	
	public static void main(String[] args) {
		QueueArray q = new QueueArray(5);
		q.enqueue(10);
		q.enqueue(20);
		q.display();
		System.out.println();
		q.dequeue();
//		System.out.println();
		q.display();
	}
		
}
