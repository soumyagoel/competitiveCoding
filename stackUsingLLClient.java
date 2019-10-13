package july18;

public class stackUsingLLClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackUsingLinkedList l4=new stackUsingLinkedList();
		l4.push(10);
		l4.display();
		l4.push(20);
		l4.display();
		l4.push(30);
		l4.display();
		l4.push(40);
		l4.display();
		l4.pop();
		l4.display();
		System.out.println(l4.top());
	}

}
