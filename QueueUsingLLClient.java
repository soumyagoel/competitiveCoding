
public class QueueUsingLLClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueUsingLinkedList l2=new queueUsingLinkedList();
		l2.enqueue(10);
		l2.display();
		l2.enqueue(20);
		l2.display();
		l2.enqueue(30);
		l2.display();
		l2.enqueue(40);
		l2.display();
		l2.dequeue();
		l2.display();
		System.out.println(l2.front());

	}

}
