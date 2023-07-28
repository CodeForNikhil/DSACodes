package DoublyLL;

public class TestDoublyLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLL d1=new DoublyLL();
		d1.insertAtBeg("Pune");
		d1.insertAtBeg("Satara");
		d1.insertAtBeg("Kolhapur");
		d1.insertAtBeg("Mumbai");
		d1.insertAtBeg("Nagpur");
		d1.forwordDisplay();
		d1.backwordDisplay();
		d1.checkCircularity(8);
		d1.deleteAtPos(1);
		d1.forwordDisplay();
	}

}
